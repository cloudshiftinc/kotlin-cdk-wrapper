@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.DestinationOptions
import software.amazon.awscdk.services.ec2.FlowLogDestinationConfig
import software.amazon.awscdk.services.ec2.FlowLogDestinationType
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class FlowLogDestinationConfigDsl {
  private val cdkBuilder: FlowLogDestinationConfig.Builder = FlowLogDestinationConfig.builder()

  public fun destinationOptions(block: DestinationOptionsDsl.() -> Unit = {}) {
    val builder = DestinationOptionsDsl()
    builder.apply(block)
    cdkBuilder.destinationOptions(builder.build())
  }

  public fun destinationOptions(destinationOptions: DestinationOptions) {
    cdkBuilder.destinationOptions(destinationOptions)
  }

  public fun iamRole(iamRole: IRole) {
    cdkBuilder.iamRole(iamRole)
  }

  public fun keyPrefix(keyPrefix: String) {
    cdkBuilder.keyPrefix(keyPrefix)
  }

  public fun logDestinationType(logDestinationType: FlowLogDestinationType) {
    cdkBuilder.logDestinationType(logDestinationType)
  }

  public fun logGroup(logGroup: ILogGroup) {
    cdkBuilder.logGroup(logGroup)
  }

  public fun s3Bucket(s3Bucket: IBucket) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  public fun build(): FlowLogDestinationConfig = cdkBuilder.build()
}
