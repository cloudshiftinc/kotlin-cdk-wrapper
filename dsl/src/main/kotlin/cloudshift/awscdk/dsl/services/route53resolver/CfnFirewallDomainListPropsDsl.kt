@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps

@CdkDslMarker
public class CfnFirewallDomainListPropsDsl {
  private val cdkBuilder: CfnFirewallDomainListProps.Builder = CfnFirewallDomainListProps.builder()

  private val _domains: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param domainFileUrl The fully qualified URL or URI of the file stored in Amazon Simple Storage
   * Service (Amazon S3) that contains the list of domains to import.
   * The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file must
   * be a text file and must contain a single domain per line.
   */
  public fun domainFileUrl(domainFileUrl: String) {
    cdkBuilder.domainFileUrl(domainFileUrl)
  }

  /**
   * @param domains A list of the domain lists that you have defined.
   */
  public fun domains(vararg domains: String) {
    _domains.addAll(listOf(*domains))
  }

  /**
   * @param domains A list of the domain lists that you have defined.
   */
  public fun domains(domains: Collection<String>) {
    _domains.addAll(domains)
  }

  /**
   * @param name The name of the domain list.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags A list of the tag keys and values that you want to associate with the domain list.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of the tag keys and values that you want to associate with the domain list.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnFirewallDomainListProps {
    if(_domains.isNotEmpty()) cdkBuilder.domains(_domains)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
