@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.omics.CfnRunGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnRunGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRunGroup.Builder = CfnRunGroup.Builder.create(scope, id)

  /**
   * The group's maximum CPU count setting.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxcpus)
   * @param maxCpus The group's maximum CPU count setting. 
   */
  public fun maxCpus(maxCpus: Number) {
    cdkBuilder.maxCpus(maxCpus)
  }

  /**
   * The group's maximum duration setting in minutes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxduration)
   * @param maxDuration The group's maximum duration setting in minutes. 
   */
  public fun maxDuration(maxDuration: Number) {
    cdkBuilder.maxDuration(maxDuration)
  }

  /**
   * The group's maximum concurrent run setting.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxruns)
   * @param maxRuns The group's maximum concurrent run setting. 
   */
  public fun maxRuns(maxRuns: Number) {
    cdkBuilder.maxRuns(maxRuns)
  }

  /**
   * The group's name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-name)
   * @param name The group's name. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Tags for the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-tags)
   * @param tags Tags for the group. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnRunGroup = cdkBuilder.build()
}
