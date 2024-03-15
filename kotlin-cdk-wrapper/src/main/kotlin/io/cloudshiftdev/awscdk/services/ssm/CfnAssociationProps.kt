@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAssociationProps {
  public fun applyOnlyAtCronInterval(): Any? = unwrap(this).getApplyOnlyAtCronInterval()

  public fun associationName(): String? = unwrap(this).getAssociationName()

  public fun automationTargetParameterName(): String? =
      unwrap(this).getAutomationTargetParameterName()

  public fun calendarNames(): List<String> = unwrap(this).getCalendarNames() ?: emptyList()

  public fun complianceSeverity(): String? = unwrap(this).getComplianceSeverity()

  public fun documentVersion(): String? = unwrap(this).getDocumentVersion()

  public fun instanceId(): String? = unwrap(this).getInstanceId()

  public fun maxConcurrency(): String? = unwrap(this).getMaxConcurrency()

  public fun maxErrors(): String? = unwrap(this).getMaxErrors()

  public fun name(): String

  public fun outputLocation(): Any? = unwrap(this).getOutputLocation()

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

  public fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

  public fun syncCompliance(): String? = unwrap(this).getSyncCompliance()

  public fun targets(): Any? = unwrap(this).getTargets()

  public fun waitForSuccessTimeoutSeconds(): Number? =
      unwrap(this).getWaitForSuccessTimeoutSeconds()

  @CdkDslMarker
  public interface Builder {
    public fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: Boolean)

    public fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: IResolvable)

    public fun associationName(associationName: String)

    public fun automationTargetParameterName(automationTargetParameterName: String)

    public fun calendarNames(calendarNames: List<String>)

    public fun calendarNames(vararg calendarNames: String)

    public fun complianceSeverity(complianceSeverity: String)

    public fun documentVersion(documentVersion: String)

    public fun instanceId(instanceId: String)

    public fun maxConcurrency(maxConcurrency: String)

    public fun maxErrors(maxErrors: String)

    public fun name(name: String)

    public fun outputLocation(outputLocation: IResolvable)

    public
        fun outputLocation(outputLocation: CfnAssociation.InstanceAssociationOutputLocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34b92b13734a06a6d27b80f559cf004af5dc448ea48bd78d272e57b02d5a5bfd")
    public
        fun outputLocation(outputLocation: CfnAssociation.InstanceAssociationOutputLocationProperty.Builder.() -> Unit)

    public fun parameters(parameters: Any)

    public fun scheduleExpression(scheduleExpression: String)

    public fun scheduleOffset(scheduleOffset: Number)

    public fun syncCompliance(syncCompliance: String)

    public fun targets(targets: IResolvable)

    public fun targets(targets: List<Any>)

    public fun targets(vararg targets: Any)

    public fun waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnAssociationProps.Builder =
        software.amazon.awscdk.services.ssm.CfnAssociationProps.builder()

    override fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: Boolean) {
      cdkBuilder.applyOnlyAtCronInterval(applyOnlyAtCronInterval)
    }

    override fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: IResolvable) {
      cdkBuilder.applyOnlyAtCronInterval(applyOnlyAtCronInterval.let(IResolvable::unwrap))
    }

    override fun associationName(associationName: String) {
      cdkBuilder.associationName(associationName)
    }

    override fun automationTargetParameterName(automationTargetParameterName: String) {
      cdkBuilder.automationTargetParameterName(automationTargetParameterName)
    }

    override fun calendarNames(calendarNames: List<String>) {
      cdkBuilder.calendarNames(calendarNames)
    }

    override fun calendarNames(vararg calendarNames: String): Unit =
        calendarNames(calendarNames.toList())

    override fun complianceSeverity(complianceSeverity: String) {
      cdkBuilder.complianceSeverity(complianceSeverity)
    }

    override fun documentVersion(documentVersion: String) {
      cdkBuilder.documentVersion(documentVersion)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun maxConcurrency(maxConcurrency: String) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    override fun maxErrors(maxErrors: String) {
      cdkBuilder.maxErrors(maxErrors)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outputLocation(outputLocation: IResolvable) {
      cdkBuilder.outputLocation(outputLocation.let(IResolvable::unwrap))
    }

    override
        fun outputLocation(outputLocation: CfnAssociation.InstanceAssociationOutputLocationProperty) {
      cdkBuilder.outputLocation(outputLocation.let(CfnAssociation.InstanceAssociationOutputLocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34b92b13734a06a6d27b80f559cf004af5dc448ea48bd78d272e57b02d5a5bfd")
    override
        fun outputLocation(outputLocation: CfnAssociation.InstanceAssociationOutputLocationProperty.Builder.() -> Unit):
        Unit =
        outputLocation(CfnAssociation.InstanceAssociationOutputLocationProperty(outputLocation))

    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    override fun scheduleExpression(scheduleExpression: String) {
      cdkBuilder.scheduleExpression(scheduleExpression)
    }

    override fun scheduleOffset(scheduleOffset: Number) {
      cdkBuilder.scheduleOffset(scheduleOffset)
    }

    override fun syncCompliance(syncCompliance: String) {
      cdkBuilder.syncCompliance(syncCompliance)
    }

    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    override fun waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds: Number) {
      cdkBuilder.waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnAssociationProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.CfnAssociationProps,
  ) : CdkObject(cdkObject), CfnAssociationProps {
    override fun applyOnlyAtCronInterval(): Any? = unwrap(this).getApplyOnlyAtCronInterval()

    override fun associationName(): String? = unwrap(this).getAssociationName()

    override fun automationTargetParameterName(): String? =
        unwrap(this).getAutomationTargetParameterName()

    override fun calendarNames(): List<String> = unwrap(this).getCalendarNames() ?: emptyList()

    override fun complianceSeverity(): String? = unwrap(this).getComplianceSeverity()

    override fun documentVersion(): String? = unwrap(this).getDocumentVersion()

    override fun instanceId(): String? = unwrap(this).getInstanceId()

    override fun maxConcurrency(): String? = unwrap(this).getMaxConcurrency()

    override fun maxErrors(): String? = unwrap(this).getMaxErrors()

    override fun name(): String = unwrap(this).getName()

    override fun outputLocation(): Any? = unwrap(this).getOutputLocation()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

    override fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

    override fun syncCompliance(): String? = unwrap(this).getSyncCompliance()

    override fun targets(): Any? = unwrap(this).getTargets()

    override fun waitForSuccessTimeoutSeconds(): Number? =
        unwrap(this).getWaitForSuccessTimeoutSeconds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnAssociationProps):
        CfnAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssociationProps):
        software.amazon.awscdk.services.ssm.CfnAssociationProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ssm.CfnAssociationProps
  }
}
