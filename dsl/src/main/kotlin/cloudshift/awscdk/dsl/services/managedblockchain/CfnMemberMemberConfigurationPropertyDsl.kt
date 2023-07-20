@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnMember

@CdkDslMarker
public class CfnMemberMemberConfigurationPropertyDsl {
  private val cdkBuilder: CfnMember.MemberConfigurationProperty.Builder =
      CfnMember.MemberConfigurationProperty.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun memberFrameworkConfiguration(memberFrameworkConfiguration: IResolvable) {
    cdkBuilder.memberFrameworkConfiguration(memberFrameworkConfiguration)
  }

  public
      fun memberFrameworkConfiguration(memberFrameworkConfiguration: CfnMember.MemberFrameworkConfigurationProperty) {
    cdkBuilder.memberFrameworkConfiguration(memberFrameworkConfiguration)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnMember.MemberConfigurationProperty = cdkBuilder.build()
}
