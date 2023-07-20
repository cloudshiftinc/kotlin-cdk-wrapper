@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutequipment

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps
import software.constructs.Construct

public object lookoutequipment {
  public inline fun cfnInferenceScheduler(
    scope: Construct,
    id: String,
    block: CfnInferenceSchedulerDsl.() -> Unit = {},
  ): CfnInferenceScheduler {
    val builder = CfnInferenceSchedulerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInferenceSchedulerDataInputConfigurationProperty(block: CfnInferenceSchedulerDataInputConfigurationPropertyDsl.() -> Unit
      = {}): CfnInferenceScheduler.DataInputConfigurationProperty {
    val builder = CfnInferenceSchedulerDataInputConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInferenceSchedulerDataOutputConfigurationProperty(block: CfnInferenceSchedulerDataOutputConfigurationPropertyDsl.() -> Unit
      = {}): CfnInferenceScheduler.DataOutputConfigurationProperty {
    val builder = CfnInferenceSchedulerDataOutputConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInferenceSchedulerInputNameConfigurationProperty(block: CfnInferenceSchedulerInputNameConfigurationPropertyDsl.() -> Unit
      = {}): CfnInferenceScheduler.InputNameConfigurationProperty {
    val builder = CfnInferenceSchedulerInputNameConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInferenceSchedulerProps(block: CfnInferenceSchedulerPropsDsl.() -> Unit =
      {}): CfnInferenceSchedulerProps {
    val builder = CfnInferenceSchedulerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInferenceSchedulerS3InputConfigurationProperty(block: CfnInferenceSchedulerS3InputConfigurationPropertyDsl.() -> Unit
      = {}): CfnInferenceScheduler.S3InputConfigurationProperty {
    val builder = CfnInferenceSchedulerS3InputConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInferenceSchedulerS3OutputConfigurationProperty(block: CfnInferenceSchedulerS3OutputConfigurationPropertyDsl.() -> Unit
      = {}): CfnInferenceScheduler.S3OutputConfigurationProperty {
    val builder = CfnInferenceSchedulerS3OutputConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
