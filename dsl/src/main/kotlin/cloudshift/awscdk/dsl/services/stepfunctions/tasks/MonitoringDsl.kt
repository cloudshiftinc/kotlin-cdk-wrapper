@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.stepfunctions.tasks.Monitoring

@CdkDslMarker
public class MonitoringDsl {
  private val cdkBuilder: Monitoring.Builder = Monitoring.builder()

  public fun logBucket(logBucket: IBucket) {
    cdkBuilder.logBucket(logBucket)
  }

  public fun logGroup(logGroup: ILogGroup) {
    cdkBuilder.logGroup(logGroup)
  }

  public fun logStreamNamePrefix(logStreamNamePrefix: String) {
    cdkBuilder.logStreamNamePrefix(logStreamNamePrefix)
  }

  public fun logging(logging: Boolean) {
    cdkBuilder.logging(logging)
  }

  public fun persistentAppUi(persistentAppUi: Boolean) {
    cdkBuilder.persistentAppUi(persistentAppUi)
  }

  public fun build(): Monitoring = cdkBuilder.build()
}
