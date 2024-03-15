@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class StringParameter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ssm.StringParameter,
) : Resource(cdkObject), IStringParameter, IParameter {
  public open fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantWrite(grantee: IGrantable): Grant =
      unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun parameterArn(): String = unwrap(this).getParameterArn()

  public override fun parameterName(): String = unwrap(this).getParameterName()

  public override fun parameterType(): String = unwrap(this).getParameterType()

  public override fun stringValue(): String = unwrap(this).getStringValue()

  @CdkDslMarker
  public interface Builder {
    public fun allowedPattern(allowedPattern: String)

    public fun dataType(dataType: ParameterDataType)

    public fun description(description: String)

    public fun parameterName(parameterName: String)

    public fun simpleName(simpleName: Boolean)

    public fun stringValue(stringValue: String)

    public fun tier(tier: ParameterTier)

    @Deprecated(message = "deprecated in CDK")
    public fun type(type: ParameterType)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.StringParameter.Builder =
        software.amazon.awscdk.services.ssm.StringParameter.Builder.create(scope, id)

    override fun allowedPattern(allowedPattern: String) {
      cdkBuilder.allowedPattern(allowedPattern)
    }

    override fun dataType(dataType: ParameterDataType) {
      cdkBuilder.dataType(dataType.let(ParameterDataType::unwrap))
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

    override fun stringValue(stringValue: String) {
      cdkBuilder.stringValue(stringValue)
    }

    override fun tier(tier: ParameterTier) {
      cdkBuilder.tier(tier.let(ParameterTier::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun type(type: ParameterType) {
      cdkBuilder.type(type.let(ParameterType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ssm.StringParameter = cdkBuilder.build()
  }

  public companion object {
    public fun fromSecureStringParameterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: SecureStringParameterAttributes,
    ): IStringParameter =
        software.amazon.awscdk.services.ssm.StringParameter.fromSecureStringParameterAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(SecureStringParameterAttributes::unwrap)).let(IStringParameter::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64b1b55fdfa5b42ba90555680348f37a5f7eb9a70ce7485030f807e3bdaace4a")
    public fun fromSecureStringParameterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: SecureStringParameterAttributes.Builder.() -> Unit,
    ): IStringParameter = fromSecureStringParameterAttributes(scope, id,
        SecureStringParameterAttributes(attrs))

    public fun fromStringParameterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: StringParameterAttributes,
    ): IStringParameter =
        software.amazon.awscdk.services.ssm.StringParameter.fromStringParameterAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(StringParameterAttributes::unwrap)).let(IStringParameter::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("123d9102253eb9c07606d49a45b8ce2ebe4db6917a9f117b688a1772ac6e5f30")
    public fun fromStringParameterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: StringParameterAttributes.Builder.() -> Unit,
    ): IStringParameter = fromStringParameterAttributes(scope, id, StringParameterAttributes(attrs))

    public fun fromStringParameterName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      stringParameterName: String,
    ): IStringParameter =
        software.amazon.awscdk.services.ssm.StringParameter.fromStringParameterName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, stringParameterName).let(IStringParameter::wrap)

    @Deprecated(message = "deprecated in CDK")
    public fun valueForSecureStringParameter(
      scope: CloudshiftdevConstructsConstruct,
      parameterName: String,
      version: Number,
    ): String =
        software.amazon.awscdk.services.ssm.StringParameter.valueForSecureStringParameter(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName, version)

    public fun valueForStringParameter(scope: CloudshiftdevConstructsConstruct,
        parameterName: String): String =
        software.amazon.awscdk.services.ssm.StringParameter.valueForStringParameter(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName)

    public fun valueForStringParameter(
      scope: CloudshiftdevConstructsConstruct,
      parameterName: String,
      version: Number,
    ): String =
        software.amazon.awscdk.services.ssm.StringParameter.valueForStringParameter(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName, version)

    @Deprecated(message = "deprecated in CDK")
    public fun valueForTypedStringParameter(scope: CloudshiftdevConstructsConstruct,
        parameterName: String): String =
        software.amazon.awscdk.services.ssm.StringParameter.valueForTypedStringParameter(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName)

    @Deprecated(message = "deprecated in CDK")
    public fun valueForTypedStringParameter(
      scope: CloudshiftdevConstructsConstruct,
      parameterName: String,
      type: ParameterType,
    ): String =
        software.amazon.awscdk.services.ssm.StringParameter.valueForTypedStringParameter(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName, type.let(ParameterType::unwrap))

    @Deprecated(message = "deprecated in CDK")
    public fun valueForTypedStringParameter(
      scope: CloudshiftdevConstructsConstruct,
      parameterName: String,
      type: ParameterType,
      version: Number,
    ): String =
        software.amazon.awscdk.services.ssm.StringParameter.valueForTypedStringParameter(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName, type.let(ParameterType::unwrap), version)

    public fun valueForTypedStringParameterV2(scope: CloudshiftdevConstructsConstruct,
        parameterName: String): String =
        software.amazon.awscdk.services.ssm.StringParameter.valueForTypedStringParameterV2(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName)

    public fun valueForTypedStringParameterV2(
      scope: CloudshiftdevConstructsConstruct,
      parameterName: String,
      type: ParameterValueType,
    ): String =
        software.amazon.awscdk.services.ssm.StringParameter.valueForTypedStringParameterV2(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName, type.let(ParameterValueType::unwrap))

    public fun valueForTypedStringParameterV2(
      scope: CloudshiftdevConstructsConstruct,
      parameterName: String,
      type: ParameterValueType,
      version: Number,
    ): String =
        software.amazon.awscdk.services.ssm.StringParameter.valueForTypedStringParameterV2(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName, type.let(ParameterValueType::unwrap), version)

    public fun valueFromLookup(scope: CloudshiftdevConstructsConstruct, parameterName: String):
        String =
        software.amazon.awscdk.services.ssm.StringParameter.valueFromLookup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): StringParameter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return StringParameter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.StringParameter):
        StringParameter = StringParameter(cdkObject)

    internal fun unwrap(wrapped: StringParameter):
        software.amazon.awscdk.services.ssm.StringParameter = wrapped.cdkObject
  }
}
