@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnFrameworkProps {
  public fun frameworkControls(): Any

  public fun frameworkDescription(): String? = unwrap(this).getFrameworkDescription()

  public fun frameworkName(): String? = unwrap(this).getFrameworkName()

  public fun frameworkTags(): List<CfnTag> = unwrap(this).getFrameworkTags()?.map(CfnTag::wrap) ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun frameworkControls(frameworkControls: IResolvable)

    public fun frameworkControls(frameworkControls: List<Any>)

    public fun frameworkControls(vararg frameworkControls: Any)

    public fun frameworkDescription(frameworkDescription: String)

    public fun frameworkName(frameworkName: String)

    public fun frameworkTags(frameworkTags: List<CfnTag>)

    public fun frameworkTags(vararg frameworkTags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnFrameworkProps.Builder =
        software.amazon.awscdk.services.backup.CfnFrameworkProps.builder()

    override fun frameworkControls(frameworkControls: IResolvable) {
      cdkBuilder.frameworkControls(frameworkControls.let(IResolvable::unwrap))
    }

    override fun frameworkControls(frameworkControls: List<Any>) {
      cdkBuilder.frameworkControls(frameworkControls)
    }

    override fun frameworkControls(vararg frameworkControls: Any): Unit =
        frameworkControls(frameworkControls.toList())

    override fun frameworkDescription(frameworkDescription: String) {
      cdkBuilder.frameworkDescription(frameworkDescription)
    }

    override fun frameworkName(frameworkName: String) {
      cdkBuilder.frameworkName(frameworkName)
    }

    override fun frameworkTags(frameworkTags: List<CfnTag>) {
      cdkBuilder.frameworkTags(frameworkTags.map(CfnTag::unwrap))
    }

    override fun frameworkTags(vararg frameworkTags: CfnTag): Unit =
        frameworkTags(frameworkTags.toList())

    public fun build(): software.amazon.awscdk.services.backup.CfnFrameworkProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.CfnFrameworkProps,
  ) : CdkObject(cdkObject), CfnFrameworkProps {
    override fun frameworkControls(): Any = unwrap(this).getFrameworkControls()

    override fun frameworkDescription(): String? = unwrap(this).getFrameworkDescription()

    override fun frameworkName(): String? = unwrap(this).getFrameworkName()

    override fun frameworkTags(): List<CfnTag> = unwrap(this).getFrameworkTags()?.map(CfnTag::wrap)
        ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFrameworkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnFrameworkProps):
        CfnFrameworkProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFrameworkProps):
        software.amazon.awscdk.services.backup.CfnFrameworkProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.backup.CfnFrameworkProps
  }
}
