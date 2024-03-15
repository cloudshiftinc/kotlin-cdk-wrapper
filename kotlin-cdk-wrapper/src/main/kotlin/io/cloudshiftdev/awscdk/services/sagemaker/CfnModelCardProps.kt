@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnModelCardProps {
  public fun content(): Any

  public fun createdBy(): Any? = unwrap(this).getCreatedBy()

  public fun lastModifiedBy(): Any? = unwrap(this).getLastModifiedBy()

  public fun modelCardName(): String

  public fun modelCardStatus(): String

  public fun securityConfig(): Any? = unwrap(this).getSecurityConfig()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun content(content: IResolvable)

    public fun content(content: CfnModelCard.ContentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b787bed0a518b924e77e6194ca0d59dea0a2c58ddf6c8d3a40bfffb128cc05a")
    public fun content(content: CfnModelCard.ContentProperty.Builder.() -> Unit)

    public fun createdBy(createdBy: IResolvable)

    public fun createdBy(createdBy: CfnModelCard.UserContextProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("491fd0e42429692b9fb81d3e6a5be0858e9a8b73a17e1d43f98ed8152799ffb4")
    public fun createdBy(createdBy: CfnModelCard.UserContextProperty.Builder.() -> Unit)

    public fun lastModifiedBy(lastModifiedBy: IResolvable)

    public fun lastModifiedBy(lastModifiedBy: CfnModelCard.UserContextProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a5445b0fc2a1eeea9c1bc547d41ab5386b90909513ee8c0dda09a4038e31c6f")
    public fun lastModifiedBy(lastModifiedBy: CfnModelCard.UserContextProperty.Builder.() -> Unit)

    public fun modelCardName(modelCardName: String)

    public fun modelCardStatus(modelCardStatus: String)

    public fun securityConfig(securityConfig: IResolvable)

    public fun securityConfig(securityConfig: CfnModelCard.SecurityConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d25b7f117423e73978e08063e13b913edc95ac36f66dc3701da2bd1c4aca4de6")
    public
        fun securityConfig(securityConfig: CfnModelCard.SecurityConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnModelCardProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelCardProps.builder()

    override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable::unwrap))
    }

    override fun content(content: CfnModelCard.ContentProperty) {
      cdkBuilder.content(content.let(CfnModelCard.ContentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b787bed0a518b924e77e6194ca0d59dea0a2c58ddf6c8d3a40bfffb128cc05a")
    override fun content(content: CfnModelCard.ContentProperty.Builder.() -> Unit): Unit =
        content(CfnModelCard.ContentProperty(content))

    override fun createdBy(createdBy: IResolvable) {
      cdkBuilder.createdBy(createdBy.let(IResolvable::unwrap))
    }

    override fun createdBy(createdBy: CfnModelCard.UserContextProperty) {
      cdkBuilder.createdBy(createdBy.let(CfnModelCard.UserContextProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("491fd0e42429692b9fb81d3e6a5be0858e9a8b73a17e1d43f98ed8152799ffb4")
    override fun createdBy(createdBy: CfnModelCard.UserContextProperty.Builder.() -> Unit): Unit =
        createdBy(CfnModelCard.UserContextProperty(createdBy))

    override fun lastModifiedBy(lastModifiedBy: IResolvable) {
      cdkBuilder.lastModifiedBy(lastModifiedBy.let(IResolvable::unwrap))
    }

    override fun lastModifiedBy(lastModifiedBy: CfnModelCard.UserContextProperty) {
      cdkBuilder.lastModifiedBy(lastModifiedBy.let(CfnModelCard.UserContextProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a5445b0fc2a1eeea9c1bc547d41ab5386b90909513ee8c0dda09a4038e31c6f")
    override
        fun lastModifiedBy(lastModifiedBy: CfnModelCard.UserContextProperty.Builder.() -> Unit):
        Unit = lastModifiedBy(CfnModelCard.UserContextProperty(lastModifiedBy))

    override fun modelCardName(modelCardName: String) {
      cdkBuilder.modelCardName(modelCardName)
    }

    override fun modelCardStatus(modelCardStatus: String) {
      cdkBuilder.modelCardStatus(modelCardStatus)
    }

    override fun securityConfig(securityConfig: IResolvable) {
      cdkBuilder.securityConfig(securityConfig.let(IResolvable::unwrap))
    }

    override fun securityConfig(securityConfig: CfnModelCard.SecurityConfigProperty) {
      cdkBuilder.securityConfig(securityConfig.let(CfnModelCard.SecurityConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d25b7f117423e73978e08063e13b913edc95ac36f66dc3701da2bd1c4aca4de6")
    override
        fun securityConfig(securityConfig: CfnModelCard.SecurityConfigProperty.Builder.() -> Unit):
        Unit = securityConfig(CfnModelCard.SecurityConfigProperty(securityConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCardProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCardProps,
  ) : CdkObject(cdkObject), CfnModelCardProps {
    override fun content(): Any = unwrap(this).getContent()

    override fun createdBy(): Any? = unwrap(this).getCreatedBy()

    override fun lastModifiedBy(): Any? = unwrap(this).getLastModifiedBy()

    override fun modelCardName(): String = unwrap(this).getModelCardName()

    override fun modelCardStatus(): String = unwrap(this).getModelCardStatus()

    override fun securityConfig(): Any? = unwrap(this).getSecurityConfig()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModelCardProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCardProps):
        CfnModelCardProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModelCardProps):
        software.amazon.awscdk.services.sagemaker.CfnModelCardProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnModelCardProps
  }
}
