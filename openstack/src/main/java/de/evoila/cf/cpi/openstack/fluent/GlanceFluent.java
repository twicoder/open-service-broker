/**
 * 
 */
package de.evoila.cf.cpi.openstack.fluent;

import java.util.List;

import org.openstack4j.api.OSClient;
import org.openstack4j.model.image.Image;

import de.evoila.cf.cpi.openstack.fluent.nova.NovaFluentConnectionFactory;

/**
 * @author Johannes Hiemer.
 *
 */
public class GlanceFluent {
	
	private OSClient client() {
		return NovaFluentConnectionFactory.connection();
	}
	
	public List<? extends Image> list() {
		return client().images().list();
	}
	
	public Image get(String imageId) {
		return client().images().get(imageId);
	}

}
