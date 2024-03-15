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

public interface CfnAppProps {
  public fun appName(): String

  public fun appType(): String

  public fun domainId(): String

  public fun resourceSpec(): Any? = unwrap(this).getResourceSpec()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun userProfileName(): String

  @CdkDslMarker
  public interface Builder {
    public fun appName(appName: String)

    public fun appType(appType: String)

    public fun domainId(domainId: String)

    public fun resourceSpec(resourceSpec: IResolvable)

    public fun resourceSpec(resourceSpec: CfnApp.ResourceSpecProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbdeb98175f36b3fc2883b11bb47a6dd065e723ce826b7b7dfd3d77207c8909b")
    public fun resourceSpec(resourceSpec: CfnApp.ResourceSpecProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userProfileName(userProfileName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnAppProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnAppProps.builder()

    override fun appName(appName: String) {
      cdkBuilder.appName(appName)
    }

    override fun appType(appType: String) {
      cdkBuilder.appType(appType)
    }

    override fun domainId(domainId: String) {
      cdkBuilder.domainId(domainId)
    }

    override fun resourceSpec(resourceSpec: IResolvable) {
      cdkBuilder.resourceSpec(resourceSpec.let(IResolvable::unwrap))
    }

    override fun resourceSpec(resourceSpec: CfnApp.ResourceSpecProperty) {
      cdkBuilder.resourceSpec(resourceSpec.let(CfnApp.ResourceSpecProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbdeb98175f36b3fc2883b11bb47a6dd065e723ce826b7b7dfd3d77207c8909b")
    override fun resourceSpec(resourceSpec: CfnApp.ResourceSpecProperty.Builder.() -> Unit): Unit =
        resourceSpec(CfnApp.ResourceSpecProperty(resourceSpec))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userProfileName(userProfileName: String) {
      cdkBuilder.userProfileName(userProfileName)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnAppProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppProps,
  ) : CdkObject(cdkObject), CfnAppProps {
    override fun appName(): String = unwrap(this).getAppName()

    override fun appType(): String = unwrap(this).getAppType()

    override fun domainId(): String = unwrap(this).getDomainId()

    override fun resourceSpec(): Any? = unwrap(this).getResourceSpec()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun userProfileName(): String = unwrap(this).getUserProfileName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAppProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppProps): CfnAppProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAppProps): software.amazon.awscdk.services.sagemaker.CfnAppProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnAppProps
  }
}
