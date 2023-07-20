@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps

@CdkDslMarker
public class CfnVpcIngressConnectionPropsDsl {
  private val cdkBuilder: CfnVpcIngressConnectionProps.Builder =
      CfnVpcIngressConnectionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun ingressVpcConfiguration(ingressVpcConfiguration: IResolvable) {
    cdkBuilder.ingressVpcConfiguration(ingressVpcConfiguration)
  }

  public
      fun ingressVpcConfiguration(ingressVpcConfiguration: CfnVpcIngressConnection.IngressVpcConfigurationProperty) {
    cdkBuilder.ingressVpcConfiguration(ingressVpcConfiguration)
  }

  public fun serviceArn(serviceArn: String) {
    cdkBuilder.serviceArn(serviceArn)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun vpcIngressConnectionName(vpcIngressConnectionName: String) {
    cdkBuilder.vpcIngressConnectionName(vpcIngressConnectionName)
  }

  public fun build(): CfnVpcIngressConnectionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
