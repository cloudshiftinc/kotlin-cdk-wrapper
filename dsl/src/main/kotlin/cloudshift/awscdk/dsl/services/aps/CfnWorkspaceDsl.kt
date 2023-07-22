@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.aps

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.aps.CfnWorkspace
import software.constructs.Construct

/**
 * The `AWS::APS::Workspace` type specifies an Amazon Managed Service for Prometheus ( Amazon
 * Managed Service for Prometheus ) workspace.
 *
 * A *workspace* is a logical and isolated Prometheus server dedicated to Prometheus resources such
 * as metrics. You can have one or more workspaces in each Region in your account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.aps.*;
 * CfnWorkspace cfnWorkspace = CfnWorkspace.Builder.create(this, "MyCfnWorkspace")
 * .alertManagerDefinition("alertManagerDefinition")
 * .alias("alias")
 * .loggingConfiguration(LoggingConfigurationProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html)
 */
@CdkDslMarker
public class CfnWorkspaceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWorkspace.Builder = CfnWorkspace.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The alert manager definition for the workspace, as a string.
   *
   * For more information, see [Alert manager and
   * templating](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alert-manager.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-alertmanagerdefinition)
   * @param alertManagerDefinition The alert manager definition for the workspace, as a string. 
   */
  public fun alertManagerDefinition(alertManagerDefinition: String) {
    cdkBuilder.alertManagerDefinition(alertManagerDefinition)
  }

  /**
   * An alias that you assign to this workspace to help you identify it.
   *
   * It does not need to be unique.
   *
   * The alias can be as many as 100 characters and can include any type of characters. Amazon
   * Managed Service for Prometheus automatically strips any blank spaces from the beginning and end of
   * the alias that you specify.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-alias)
   * @param alias An alias that you assign to this workspace to help you identify it. 
   */
  public fun alias(alias: String) {
    cdkBuilder.alias(alias)
  }

  /**
   * The LoggingConfiguration attribute is used to set the logging configuration for the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
   * @param loggingConfiguration The LoggingConfiguration attribute is used to set the logging
   * configuration for the workspace. 
   */
  public fun loggingConfiguration(loggingConfiguration: IResolvable) {
    cdkBuilder.loggingConfiguration(loggingConfiguration)
  }

  /**
   * The LoggingConfiguration attribute is used to set the logging configuration for the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-loggingconfiguration)
   * @param loggingConfiguration The LoggingConfiguration attribute is used to set the logging
   * configuration for the workspace. 
   */
  public fun loggingConfiguration(loggingConfiguration: CfnWorkspace.LoggingConfigurationProperty) {
    cdkBuilder.loggingConfiguration(loggingConfiguration)
  }

  /**
   * A list of tag keys and values to associate with the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-tags)
   * @param tags A list of tag keys and values to associate with the workspace. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of tag keys and values to associate with the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html#cfn-aps-workspace-tags)
   * @param tags A list of tag keys and values to associate with the workspace. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnWorkspace {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
