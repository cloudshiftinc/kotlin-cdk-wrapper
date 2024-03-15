@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Unit

public interface UnknownPrincipalProps {
  public fun resource(): IConstruct

  @CdkDslMarker
  public interface Builder {
    public fun resource(resource: IConstruct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.UnknownPrincipalProps.Builder =
        software.amazon.awscdk.services.iam.UnknownPrincipalProps.builder()

    override fun resource(resource: IConstruct) {
      cdkBuilder.resource(resource.let(IConstruct::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.UnknownPrincipalProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.UnknownPrincipalProps,
  ) : CdkObject(cdkObject), UnknownPrincipalProps {
    override fun resource(): IConstruct = unwrap(this).getResource().let(IConstruct::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UnknownPrincipalProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.UnknownPrincipalProps):
        UnknownPrincipalProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UnknownPrincipalProps):
        software.amazon.awscdk.services.iam.UnknownPrincipalProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.UnknownPrincipalProps
  }
}
