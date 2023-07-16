@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps
import software.constructs.Construct

public object dlm {
  public inline fun cfnLifecyclePolicy(
    scope: Construct,
    id: String,
    block: CfnLifecyclePolicyDsl.() -> Unit = {},
  ): CfnLifecyclePolicy {
    val builder = CfnLifecyclePolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyActionProperty(block: CfnLifecyclePolicyActionPropertyDsl.() -> Unit =
      {}): CfnLifecyclePolicy.ActionProperty {
    val builder = CfnLifecyclePolicyActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyArchiveRetainRuleProperty(block: CfnLifecyclePolicyArchiveRetainRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.ArchiveRetainRuleProperty {
    val builder = CfnLifecyclePolicyArchiveRetainRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyArchiveRuleProperty(block: CfnLifecyclePolicyArchiveRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.ArchiveRuleProperty {
    val builder = CfnLifecyclePolicyArchiveRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyCreateRuleProperty(block: CfnLifecyclePolicyCreateRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.CreateRuleProperty {
    val builder = CfnLifecyclePolicyCreateRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyCrossRegionCopyActionProperty(block: CfnLifecyclePolicyCrossRegionCopyActionPropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.CrossRegionCopyActionProperty {
    val builder = CfnLifecyclePolicyCrossRegionCopyActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyCrossRegionCopyDeprecateRuleProperty(block: CfnLifecyclePolicyCrossRegionCopyDeprecateRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty {
    val builder = CfnLifecyclePolicyCrossRegionCopyDeprecateRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyCrossRegionCopyRetainRuleProperty(block: CfnLifecyclePolicyCrossRegionCopyRetainRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty {
    val builder = CfnLifecyclePolicyCrossRegionCopyRetainRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyCrossRegionCopyRuleProperty(block: CfnLifecyclePolicyCrossRegionCopyRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.CrossRegionCopyRuleProperty {
    val builder = CfnLifecyclePolicyCrossRegionCopyRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyDeprecateRuleProperty(block: CfnLifecyclePolicyDeprecateRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.DeprecateRuleProperty {
    val builder = CfnLifecyclePolicyDeprecateRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyEncryptionConfigurationProperty(block: CfnLifecyclePolicyEncryptionConfigurationPropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.EncryptionConfigurationProperty {
    val builder = CfnLifecyclePolicyEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyEventParametersProperty(block: CfnLifecyclePolicyEventParametersPropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.EventParametersProperty {
    val builder = CfnLifecyclePolicyEventParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyEventSourceProperty(block: CfnLifecyclePolicyEventSourcePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.EventSourceProperty {
    val builder = CfnLifecyclePolicyEventSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyFastRestoreRuleProperty(block: CfnLifecyclePolicyFastRestoreRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.FastRestoreRuleProperty {
    val builder = CfnLifecyclePolicyFastRestoreRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyParametersProperty(block: CfnLifecyclePolicyParametersPropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.ParametersProperty {
    val builder = CfnLifecyclePolicyParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyPolicyDetailsProperty(block: CfnLifecyclePolicyPolicyDetailsPropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.PolicyDetailsProperty {
    val builder = CfnLifecyclePolicyPolicyDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLifecyclePolicyProps(block: CfnLifecyclePolicyPropsDsl.() -> Unit = {}):
      CfnLifecyclePolicyProps {
    val builder = CfnLifecyclePolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyRetainRuleProperty(block: CfnLifecyclePolicyRetainRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.RetainRuleProperty {
    val builder = CfnLifecyclePolicyRetainRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyRetentionArchiveTierProperty(block: CfnLifecyclePolicyRetentionArchiveTierPropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.RetentionArchiveTierProperty {
    val builder = CfnLifecyclePolicyRetentionArchiveTierPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyScheduleProperty(block: CfnLifecyclePolicySchedulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.ScheduleProperty {
    val builder = CfnLifecyclePolicySchedulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLifecyclePolicyShareRuleProperty(block: CfnLifecyclePolicyShareRulePropertyDsl.() -> Unit
      = {}): CfnLifecyclePolicy.ShareRuleProperty {
    val builder = CfnLifecyclePolicyShareRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
