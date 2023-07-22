@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps

@CdkDslMarker
public class CfnPublicDnsNamespacePropsDsl {
  private val cdkBuilder: CfnPublicDnsNamespaceProps.Builder = CfnPublicDnsNamespaceProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description A description for the namespace.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name that you want to assign to this namespace. 
   *
   * Do not include sensitive information in the name. The name is publicly available using DNS
   * queries.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param properties Properties for the public DNS namespace.
   */
  public fun properties(properties: IResolvable) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param properties Properties for the public DNS namespace.
   */
  public fun properties(properties: CfnPublicDnsNamespace.PropertiesProperty) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param tags The tags for the namespace.
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags for the namespace.
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPublicDnsNamespaceProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
