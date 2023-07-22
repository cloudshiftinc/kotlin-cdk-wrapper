@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnCluster

@CdkDslMarker
public class CfnClusterClusterSettingsPropertyDsl {
  private val cdkBuilder: CfnCluster.ClusterSettingsProperty.Builder =
      CfnCluster.ClusterSettingsProperty.builder()

  /**
   * @param name The name of the cluster setting.
   * The value is `containerInsights` .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value to set for the cluster setting. The supported values are `enabled` and
   * `disabled` .
   * If you set `name` to `containerInsights` and `value` to `enabled` , CloudWatch Container
   * Insights will be on for the cluster, otherwise it will be off unless the `containerInsights`
   * account setting is turned on. If a cluster value is specified, it will override the
   * `containerInsights` value set with
   * [PutAccountSetting](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PutAccountSetting.html)
   * or
   * [PutAccountSettingDefault](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PutAccountSettingDefault.html)
   * .
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnCluster.ClusterSettingsProperty = cdkBuilder.build()
}
