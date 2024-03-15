@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.finspace

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnEnvironmentProps {
  @Deprecated(message = "deprecated in CDK")
  public fun dataBundles(): List<String> = unwrap(this).getDataBundles() ?: emptyList()

  public fun description(): String? = unwrap(this).getDescription()

  public fun federationMode(): String? = unwrap(this).getFederationMode()

  public fun federationParameters(): Any? = unwrap(this).getFederationParameters()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun name(): String

  public fun superuserParameters(): Any? = unwrap(this).getSuperuserParameters()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun dataBundles(dataBundles: List<String>)

    @Deprecated(message = "deprecated in CDK")
    public fun dataBundles(vararg dataBundles: String)

    public fun description(description: String)

    public fun federationMode(federationMode: String)

    public fun federationParameters(federationParameters: IResolvable)

    public
        fun federationParameters(federationParameters: CfnEnvironment.FederationParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adcd8ff86bfe80472eba4ba3c2985319541cce96282d0134cf04c5da612b7024")
    public
        fun federationParameters(federationParameters: CfnEnvironment.FederationParametersProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun name(name: String)

    public fun superuserParameters(superuserParameters: IResolvable)

    public fun superuserParameters(superuserParameters: CfnEnvironment.SuperuserParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("833fdcba7cbd44cfeb35fd1e294fbd189cbc1a1dd6d81f03e677cbab5c1385d9")
    public
        fun superuserParameters(superuserParameters: CfnEnvironment.SuperuserParametersProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.finspace.CfnEnvironmentProps.Builder =
        software.amazon.awscdk.services.finspace.CfnEnvironmentProps.builder()

    @Deprecated(message = "deprecated in CDK")
    override fun dataBundles(dataBundles: List<String>) {
      cdkBuilder.dataBundles(dataBundles)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun dataBundles(vararg dataBundles: String): Unit = dataBundles(dataBundles.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun federationMode(federationMode: String) {
      cdkBuilder.federationMode(federationMode)
    }

    override fun federationParameters(federationParameters: IResolvable) {
      cdkBuilder.federationParameters(federationParameters.let(IResolvable::unwrap))
    }

    override
        fun federationParameters(federationParameters: CfnEnvironment.FederationParametersProperty) {
      cdkBuilder.federationParameters(federationParameters.let(CfnEnvironment.FederationParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adcd8ff86bfe80472eba4ba3c2985319541cce96282d0134cf04c5da612b7024")
    override
        fun federationParameters(federationParameters: CfnEnvironment.FederationParametersProperty.Builder.() -> Unit):
        Unit =
        federationParameters(CfnEnvironment.FederationParametersProperty(federationParameters))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun superuserParameters(superuserParameters: IResolvable) {
      cdkBuilder.superuserParameters(superuserParameters.let(IResolvable::unwrap))
    }

    override
        fun superuserParameters(superuserParameters: CfnEnvironment.SuperuserParametersProperty) {
      cdkBuilder.superuserParameters(superuserParameters.let(CfnEnvironment.SuperuserParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("833fdcba7cbd44cfeb35fd1e294fbd189cbc1a1dd6d81f03e677cbab5c1385d9")
    override
        fun superuserParameters(superuserParameters: CfnEnvironment.SuperuserParametersProperty.Builder.() -> Unit):
        Unit = superuserParameters(CfnEnvironment.SuperuserParametersProperty(superuserParameters))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.finspace.CfnEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironmentProps,
  ) : CdkObject(cdkObject), CfnEnvironmentProps {
    @Deprecated(message = "deprecated in CDK")
    override fun dataBundles(): List<String> = unwrap(this).getDataBundles() ?: emptyList()

    override fun description(): String? = unwrap(this).getDescription()

    override fun federationMode(): String? = unwrap(this).getFederationMode()

    override fun federationParameters(): Any? = unwrap(this).getFederationParameters()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun name(): String = unwrap(this).getName()

    override fun superuserParameters(): Any? = unwrap(this).getSuperuserParameters()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironmentProps):
        CfnEnvironmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProps):
        software.amazon.awscdk.services.finspace.CfnEnvironmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.finspace.CfnEnvironmentProps
  }
}
