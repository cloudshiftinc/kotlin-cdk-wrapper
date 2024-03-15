@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAssociation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun applyOnlyAtCronInterval(): Any? = unwrap(this).getApplyOnlyAtCronInterval()

  public open fun applyOnlyAtCronInterval(`value`: Boolean) {
    unwrap(this).setApplyOnlyAtCronInterval(`value`)
  }

  public open fun applyOnlyAtCronInterval(`value`: IResolvable) {
    unwrap(this).setApplyOnlyAtCronInterval(`value`.let(IResolvable::unwrap))
  }

  public open fun associationName(): String? = unwrap(this).getAssociationName()

  public open fun associationName(`value`: String) {
    unwrap(this).setAssociationName(`value`)
  }

  public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

  public open fun automationTargetParameterName(): String? =
      unwrap(this).getAutomationTargetParameterName()

  public open fun automationTargetParameterName(`value`: String) {
    unwrap(this).setAutomationTargetParameterName(`value`)
  }

  public open fun calendarNames(): List<String> = unwrap(this).getCalendarNames() ?: emptyList()

  public open fun calendarNames(`value`: List<String>) {
    unwrap(this).setCalendarNames(`value`)
  }

  public open fun calendarNames(vararg `value`: String): Unit = calendarNames(`value`.toList())

  public open fun complianceSeverity(): String? = unwrap(this).getComplianceSeverity()

  public open fun complianceSeverity(`value`: String) {
    unwrap(this).setComplianceSeverity(`value`)
  }

  public open fun documentVersion(): String? = unwrap(this).getDocumentVersion()

  public open fun documentVersion(`value`: String) {
    unwrap(this).setDocumentVersion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceId(): String? = unwrap(this).getInstanceId()

  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  public open fun maxConcurrency(): String? = unwrap(this).getMaxConcurrency()

  public open fun maxConcurrency(`value`: String) {
    unwrap(this).setMaxConcurrency(`value`)
  }

  public open fun maxErrors(): String? = unwrap(this).getMaxErrors()

  public open fun maxErrors(`value`: String) {
    unwrap(this).setMaxErrors(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun outputLocation(): Any? = unwrap(this).getOutputLocation()

  public open fun outputLocation(`value`: IResolvable) {
    unwrap(this).setOutputLocation(`value`.let(IResolvable::unwrap))
  }

  public open fun outputLocation(`value`: InstanceAssociationOutputLocationProperty) {
    unwrap(this).setOutputLocation(`value`.let(InstanceAssociationOutputLocationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e56439f4b0363ec3e10bbddf195e4ce58688dbf40ea723f02b6139da37c5360")
  public open
      fun outputLocation(`value`: InstanceAssociationOutputLocationProperty.Builder.() -> Unit):
      Unit = outputLocation(InstanceAssociationOutputLocationProperty(`value`))

  public open fun parameters(): Any? = unwrap(this).getParameters()

  public open fun parameters(`value`: Any) {
    unwrap(this).setParameters(`value`)
  }

  public open fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

  public open fun scheduleExpression(`value`: String) {
    unwrap(this).setScheduleExpression(`value`)
  }

  public open fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

  public open fun scheduleOffset(`value`: Number) {
    unwrap(this).setScheduleOffset(`value`)
  }

  public open fun syncCompliance(): String? = unwrap(this).getSyncCompliance()

  public open fun syncCompliance(`value`: String) {
    unwrap(this).setSyncCompliance(`value`)
  }

  public open fun targets(): Any? = unwrap(this).getTargets()

  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  public open fun targets(__idx_ac66f0: List<Any>) {
    unwrap(this).setTargets(__idx_ac66f0)
  }

  public open fun targets(vararg __idx_ac66f0: Any): Unit = targets(__idx_ac66f0.toList())

  public open fun waitForSuccessTimeoutSeconds(): Number? =
      unwrap(this).getWaitForSuccessTimeoutSeconds()

  public open fun waitForSuccessTimeoutSeconds(`value`: Number) {
    unwrap(this).setWaitForSuccessTimeoutSeconds(`value`)
  }

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

    public fun outputLocation(outputLocation: InstanceAssociationOutputLocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1683d449e4e23bb23aa1a3820b4404b90f5308902fbd9751df5dac86071e3a88")
    public
        fun outputLocation(outputLocation: InstanceAssociationOutputLocationProperty.Builder.() -> Unit)

    public fun parameters(parameters: Any)

    public fun scheduleExpression(scheduleExpression: String)

    public fun scheduleOffset(scheduleOffset: Number)

    public fun syncCompliance(syncCompliance: String)

    public fun targets(targets: IResolvable)

    public fun targets(targets: List<Any>)

    public fun targets(vararg targets: Any)

    public fun waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnAssociation.Builder =
        software.amazon.awscdk.services.ssm.CfnAssociation.Builder.create(scope, id)

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

    override fun outputLocation(outputLocation: InstanceAssociationOutputLocationProperty) {
      cdkBuilder.outputLocation(outputLocation.let(InstanceAssociationOutputLocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1683d449e4e23bb23aa1a3820b4404b90f5308902fbd9751df5dac86071e3a88")
    override
        fun outputLocation(outputLocation: InstanceAssociationOutputLocationProperty.Builder.() -> Unit):
        Unit = outputLocation(InstanceAssociationOutputLocationProperty(outputLocation))

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

    public fun build(): software.amazon.awscdk.services.ssm.CfnAssociation = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssm.CfnAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation): CfnAssociation
        = CfnAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnAssociation): software.amazon.awscdk.services.ssm.CfnAssociation
        = wrapped.cdkObject
  }

  public interface TargetProperty {
    public fun key(): String

    public fun values(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty,
    ) : CdkObject(cdkObject), TargetProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty):
          TargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetProperty):
          software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty
    }
  }

  public interface S3OutputLocationProperty {
    public fun outputS3BucketName(): String? = unwrap(this).getOutputS3BucketName()

    public fun outputS3KeyPrefix(): String? = unwrap(this).getOutputS3KeyPrefix()

    public fun outputS3Region(): String? = unwrap(this).getOutputS3Region()

    @CdkDslMarker
    public interface Builder {
      public fun outputS3BucketName(outputS3BucketName: String)

      public fun outputS3KeyPrefix(outputS3KeyPrefix: String)

      public fun outputS3Region(outputS3Region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty.builder()

      override fun outputS3BucketName(outputS3BucketName: String) {
        cdkBuilder.outputS3BucketName(outputS3BucketName)
      }

      override fun outputS3KeyPrefix(outputS3KeyPrefix: String) {
        cdkBuilder.outputS3KeyPrefix(outputS3KeyPrefix)
      }

      override fun outputS3Region(outputS3Region: String) {
        cdkBuilder.outputS3Region(outputS3Region)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty,
    ) : CdkObject(cdkObject), S3OutputLocationProperty {
      override fun outputS3BucketName(): String? = unwrap(this).getOutputS3BucketName()

      override fun outputS3KeyPrefix(): String? = unwrap(this).getOutputS3KeyPrefix()

      override fun outputS3Region(): String? = unwrap(this).getOutputS3Region()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3OutputLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty):
          S3OutputLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputLocationProperty):
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty
    }
  }

  public interface InstanceAssociationOutputLocationProperty {
    public fun s3Location(): Any? = unwrap(this).getS3Location()

    @CdkDslMarker
    public interface Builder {
      public fun s3Location(s3Location: IResolvable)

      public fun s3Location(s3Location: S3OutputLocationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9c59af672b5f9a495e841765dce821e782b6e5ccfb4906892e2f4f9a56ee979")
      public fun s3Location(s3Location: S3OutputLocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty.builder()

      override fun s3Location(s3Location: IResolvable) {
        cdkBuilder.s3Location(s3Location.let(IResolvable::unwrap))
      }

      override fun s3Location(s3Location: S3OutputLocationProperty) {
        cdkBuilder.s3Location(s3Location.let(S3OutputLocationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9c59af672b5f9a495e841765dce821e782b6e5ccfb4906892e2f4f9a56ee979")
      override fun s3Location(s3Location: S3OutputLocationProperty.Builder.() -> Unit): Unit =
          s3Location(S3OutputLocationProperty(s3Location))

      public fun build():
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty,
    ) : CdkObject(cdkObject), InstanceAssociationOutputLocationProperty {
      override fun s3Location(): Any? = unwrap(this).getS3Location()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceAssociationOutputLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty):
          InstanceAssociationOutputLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceAssociationOutputLocationProperty):
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty
    }
  }
}
