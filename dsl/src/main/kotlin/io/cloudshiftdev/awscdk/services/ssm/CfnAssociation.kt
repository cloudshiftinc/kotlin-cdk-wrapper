package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation,
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  public open fun waitForSuccessTimeoutSeconds(): Number? =
      unwrap(this).getWaitForSuccessTimeoutSeconds()

  public open fun waitForSuccessTimeoutSeconds(`value`: Number) {
    unwrap(this).setWaitForSuccessTimeoutSeconds(`value`)
  }

  public interface Builder {
    public fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: Boolean) {
    }

    public fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: IResolvable) {
    }

    public fun associationName(associationName: String) {
    }

    public fun automationTargetParameterName(automationTargetParameterName: String) {
    }

    public fun calendarNames(calendarNames: List<String>) {
    }

    public fun complianceSeverity(complianceSeverity: String) {
    }

    public fun documentVersion(documentVersion: String) {
    }

    public fun instanceId(instanceId: String) {
    }

    public fun maxConcurrency(maxConcurrency: String) {
    }

    public fun maxErrors(maxErrors: String) {
    }

    public fun name(name: String) {
    }

    public fun outputLocation(outputLocation: IResolvable) {
    }

    public fun outputLocation(outputLocation: InstanceAssociationOutputLocationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1683d449e4e23bb23aa1a3820b4404b90f5308902fbd9751df5dac86071e3a88")
    public
        fun outputLocation(outputLocation: InstanceAssociationOutputLocationProperty.Builder.() -> Unit) {
    }

    public fun parameters(parameters: Any) {
    }

    public fun scheduleExpression(scheduleExpression: String) {
    }

    public fun scheduleOffset(scheduleOffset: Number) {
    }

    public fun syncCompliance(syncCompliance: String) {
    }

    public fun targets(targets: IResolvable) {
    }

    public fun targets(targets: List<Any>) {
    }

    public fun waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds: Number) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnAssociation.Builder =
        software.amazon.awscdk.services.ssm.CfnAssociation.Builder.create(scope, id)

    public override fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: Boolean) {
      cdkBuilder.applyOnlyAtCronInterval(applyOnlyAtCronInterval)
    }

    public override fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: IResolvable) {
      cdkBuilder.applyOnlyAtCronInterval(applyOnlyAtCronInterval.let(IResolvable::unwrap))
    }

    public override fun associationName(associationName: String) {
      cdkBuilder.associationName(associationName)
    }

    public override fun automationTargetParameterName(automationTargetParameterName: String) {
      cdkBuilder.automationTargetParameterName(automationTargetParameterName)
    }

    public override fun calendarNames(calendarNames: List<String>) {
      cdkBuilder.calendarNames(calendarNames)
    }

    public override fun complianceSeverity(complianceSeverity: String) {
      cdkBuilder.complianceSeverity(complianceSeverity)
    }

    public override fun documentVersion(documentVersion: String) {
      cdkBuilder.documentVersion(documentVersion)
    }

    public override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    public override fun maxConcurrency(maxConcurrency: String) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    public override fun maxErrors(maxErrors: String) {
      cdkBuilder.maxErrors(maxErrors)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun outputLocation(outputLocation: IResolvable) {
      cdkBuilder.outputLocation(outputLocation.let(IResolvable::unwrap))
    }

    public override fun outputLocation(outputLocation: InstanceAssociationOutputLocationProperty) {
      cdkBuilder.outputLocation(outputLocation.let(InstanceAssociationOutputLocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1683d449e4e23bb23aa1a3820b4404b90f5308902fbd9751df5dac86071e3a88")
    public override
        fun outputLocation(outputLocation: InstanceAssociationOutputLocationProperty.Builder.() -> Unit):
        Unit = outputLocation(InstanceAssociationOutputLocationProperty(outputLocation))

    public override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    public override fun scheduleExpression(scheduleExpression: String) {
      cdkBuilder.scheduleExpression(scheduleExpression)
    }

    public override fun scheduleOffset(scheduleOffset: Number) {
      cdkBuilder.scheduleOffset(scheduleOffset)
    }

    public override fun syncCompliance(syncCompliance: String) {
      cdkBuilder.syncCompliance(syncCompliance)
    }

    public override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    public override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    public override fun waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds: Number) {
      cdkBuilder.waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnAssociation = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun key(key: String) {
      }

      public fun values(values: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      public fun build(): software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty,
    ) : TargetProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty):
          TargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetProperty):
          software.amazon.awscdk.services.ssm.CfnAssociation.TargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3OutputLocationProperty {
    public fun outputS3BucketName(): String? = unwrap(this).getOutputS3BucketName()

    public fun outputS3KeyPrefix(): String? = unwrap(this).getOutputS3KeyPrefix()

    public fun outputS3Region(): String? = unwrap(this).getOutputS3Region()

    public interface Builder {
      public fun outputS3BucketName(outputS3BucketName: String) {
      }

      public fun outputS3KeyPrefix(outputS3KeyPrefix: String) {
      }

      public fun outputS3Region(outputS3Region: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty.builder()

      public override fun outputS3BucketName(outputS3BucketName: String) {
        cdkBuilder.outputS3BucketName(outputS3BucketName)
      }

      public override fun outputS3KeyPrefix(outputS3KeyPrefix: String) {
        cdkBuilder.outputS3KeyPrefix(outputS3KeyPrefix)
      }

      public override fun outputS3Region(outputS3Region: String) {
        cdkBuilder.outputS3Region(outputS3Region)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty,
    ) : S3OutputLocationProperty {
      public override fun outputS3BucketName(): String? = unwrap(this).getOutputS3BucketName()

      public override fun outputS3KeyPrefix(): String? = unwrap(this).getOutputS3KeyPrefix()

      public override fun outputS3Region(): String? = unwrap(this).getOutputS3Region()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3OutputLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty):
          S3OutputLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputLocationProperty):
          software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InstanceAssociationOutputLocationProperty {
    public fun s3Location(): Any? = unwrap(this).getS3Location()

    public interface Builder {
      public fun s3Location(s3Location: IResolvable) {
      }

      public fun s3Location(s3Location: S3OutputLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9c59af672b5f9a495e841765dce821e782b6e5ccfb4906892e2f4f9a56ee979")
      public fun s3Location(s3Location: S3OutputLocationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty.builder()

      public override fun s3Location(s3Location: IResolvable) {
        cdkBuilder.s3Location(s3Location.let(IResolvable::unwrap))
      }

      public override fun s3Location(s3Location: S3OutputLocationProperty) {
        cdkBuilder.s3Location(s3Location.let(S3OutputLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9c59af672b5f9a495e841765dce821e782b6e5ccfb4906892e2f4f9a56ee979")
      public override fun s3Location(s3Location: S3OutputLocationProperty.Builder.() -> Unit): Unit
          = s3Location(S3OutputLocationProperty(s3Location))

      public fun build():
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty,
    ) : InstanceAssociationOutputLocationProperty {
      public override fun s3Location(): Any? = unwrap(this).getS3Location()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }
}
