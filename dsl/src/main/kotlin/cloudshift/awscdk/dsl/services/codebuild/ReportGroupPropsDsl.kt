@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.codebuild.ReportGroupProps
import software.amazon.awscdk.services.codebuild.ReportGroupType
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class ReportGroupPropsDsl {
  private val cdkBuilder: ReportGroupProps.Builder = ReportGroupProps.builder()

  public fun exportBucket(exportBucket: IBucket) {
    cdkBuilder.exportBucket(exportBucket)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun reportGroupName(reportGroupName: String) {
    cdkBuilder.reportGroupName(reportGroupName)
  }

  public fun type(type: ReportGroupType) {
    cdkBuilder.type(type)
  }

  public fun zipExport(zipExport: Boolean) {
    cdkBuilder.zipExport(zipExport)
  }

  public fun build(): ReportGroupProps = cdkBuilder.build()
}
