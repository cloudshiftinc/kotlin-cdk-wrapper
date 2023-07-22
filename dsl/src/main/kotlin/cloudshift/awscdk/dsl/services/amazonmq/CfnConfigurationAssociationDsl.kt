@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnConfigurationAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConfigurationAssociation.Builder =
      CfnConfigurationAssociation.Builder.create(scope, id)

  /**
   * The broker to associate with a configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-broker)
   * @param broker The broker to associate with a configuration. 
   */
  public fun broker(broker: String) {
    cdkBuilder.broker(broker)
  }

  /**
   * The configuration to associate with a broker.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-configuration)
   * @param configuration The configuration to associate with a broker. 
   */
  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * The configuration to associate with a broker.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-configuration)
   * @param configuration The configuration to associate with a broker. 
   */
  public fun configuration(configuration: CfnConfigurationAssociation.ConfigurationIdProperty) {
    cdkBuilder.configuration(configuration)
  }

  public fun build(): CfnConfigurationAssociation = cdkBuilder.build()
}
