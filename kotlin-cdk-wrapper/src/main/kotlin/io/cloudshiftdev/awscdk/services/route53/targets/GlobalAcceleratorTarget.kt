@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.services.globalaccelerator.IAccelerator

/**
 * Use a Global Accelerator instance domain name as an alias record target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
 * HostedZone zone;
 * Accelerator accelerator;
 * ARecord.Builder.create(this, "AliasRecord")
 * .zone(zone)
 * .target(RecordTarget.fromAlias(
 * new GlobalAcceleratorTarget(accelerator, Map.of(
 * "evaluateTargetHealth", true))))
 * .build();
 * ```
 */
public open class GlobalAcceleratorTarget(
  cdkObject: software.amazon.awscdk.services.route53.targets.GlobalAcceleratorTarget,
) : GlobalAcceleratorDomainTarget(cdkObject) {
  public constructor(accelerator: IAccelerator) :
      this(software.amazon.awscdk.services.route53.targets.GlobalAcceleratorTarget(accelerator.let(IAccelerator.Companion::unwrap))
  )

  public constructor(accelerator: IAccelerator, props: IAliasRecordTargetProps) :
      this(software.amazon.awscdk.services.route53.targets.GlobalAcceleratorTarget(accelerator.let(IAccelerator.Companion::unwrap),
      props.let(IAliasRecordTargetProps.Companion::unwrap))
  )

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.GlobalAcceleratorTarget):
        GlobalAcceleratorTarget = GlobalAcceleratorTarget(cdkObject)

    internal fun unwrap(wrapped: GlobalAcceleratorTarget):
        software.amazon.awscdk.services.route53.targets.GlobalAcceleratorTarget = wrapped.cdkObject
        as software.amazon.awscdk.services.route53.targets.GlobalAcceleratorTarget
  }
}
