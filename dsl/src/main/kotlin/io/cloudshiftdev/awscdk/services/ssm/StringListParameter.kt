package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class StringListParameter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssm.StringListParameter,
) : Resource(cdkObject), IStringListParameter, IParameter {
  public open fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantWrite(grantee: IGrantable): Grant =
      unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun parameterArn(): String = unwrap(this).getParameterArn()

  public override fun parameterName(): String = unwrap(this).getParameterName()

  public override fun parameterType(): String = unwrap(this).getParameterType()

  public override fun stringListValue(): List<String> = unwrap(this).getStringListValue()

  public interface Builder {
    public fun allowedPattern(allowedPattern: String)

    public fun description(description: String)

    public fun parameterName(parameterName: String)

    public fun simpleName(simpleName: Boolean)

    public fun stringListValue(stringListValue: List<String>)

    public fun stringListValue(vararg stringListValue: String)

    public fun tier(tier: ParameterTier)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.StringListParameter.Builder =
        software.amazon.awscdk.services.ssm.StringListParameter.Builder.create(scope, id)

    override fun allowedPattern(allowedPattern: String) {
      cdkBuilder.allowedPattern(allowedPattern)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    override fun simpleName(simpleName: Boolean) {
      cdkBuilder.simpleName(simpleName)
    }

    override fun stringListValue(stringListValue: List<String>) {
      cdkBuilder.stringListValue(stringListValue)
    }

    override fun stringListValue(vararg stringListValue: String): Unit =
        stringListValue(stringListValue.toList())

    override fun tier(tier: ParameterTier) {
      cdkBuilder.tier(tier.let(ParameterTier::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ssm.StringListParameter = cdkBuilder.build()
  }

  public companion object {
    public open fun fromListParameterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ListParameterAttributes,
    ): IStringListParameter =
        software.amazon.awscdk.services.ssm.StringListParameter.fromListParameterAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ListParameterAttributes::unwrap)).let(IStringListParameter::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc836518e1f7fbb91648bb3769bf2dea12bec5f330ace7c70ee50a8a23d820f6")
    public open fun fromListParameterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ListParameterAttributes.Builder.() -> Unit,
    ): IStringListParameter = fromListParameterAttributes(scope, id, ListParameterAttributes(attrs))

    public open fun fromStringListParameterName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      stringListParameterName: String,
    ): IStringListParameter =
        software.amazon.awscdk.services.ssm.StringListParameter.fromStringListParameterName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, stringListParameterName).let(IStringListParameter::wrap)

    public open fun valueForTypedListParameter(scope: CloudshiftdevConstructsConstruct,
        parameterName: String): List<String> =
        software.amazon.awscdk.services.ssm.StringListParameter.valueForTypedListParameter(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName)

    public open fun valueForTypedListParameter(
      scope: CloudshiftdevConstructsConstruct,
      parameterName: String,
      type: ParameterValueType,
    ): List<String> =
        software.amazon.awscdk.services.ssm.StringListParameter.valueForTypedListParameter(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName, type.let(ParameterValueType::unwrap))

    public open fun valueForTypedListParameter(
      scope: CloudshiftdevConstructsConstruct,
      parameterName: String,
      type: ParameterValueType,
      version: Number,
    ): List<String> =
        software.amazon.awscdk.services.ssm.StringListParameter.valueForTypedListParameter(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName, type.let(ParameterValueType::unwrap), version)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): StringListParameter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return StringListParameter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.StringListParameter):
        StringListParameter = StringListParameter(cdkObject)

    internal fun unwrap(wrapped: StringListParameter):
        software.amazon.awscdk.services.ssm.StringListParameter = wrapped.cdkObject
  }
}
