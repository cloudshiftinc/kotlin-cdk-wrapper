@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Unit

/**
 * Properties for an UnknownPrincipal.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import software.constructs.*;
 * Construct construct;
 * UnknownPrincipalProps unknownPrincipalProps = UnknownPrincipalProps.builder()
 * .resource(construct)
 * .build();
 * ```
 */
public interface UnknownPrincipalProps {
  /**
   * The resource the role proxy is for.
   */
  public fun resource(): IConstruct

  /**
   * A builder for [UnknownPrincipalProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resource The resource the role proxy is for. 
     */
    public fun resource(resource: IConstruct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.UnknownPrincipalProps.Builder =
        software.amazon.awscdk.services.iam.UnknownPrincipalProps.builder()

    /**
     * @param resource The resource the role proxy is for. 
     */
    override fun resource(resource: IConstruct) {
      cdkBuilder.resource(resource.let(IConstruct::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.UnknownPrincipalProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.UnknownPrincipalProps,
  ) : CdkObject(cdkObject), UnknownPrincipalProps {
    /**
     * The resource the role proxy is for.
     */
    override fun resource(): IConstruct = unwrap(this).getResource().let(IConstruct::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UnknownPrincipalProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.UnknownPrincipalProps):
        UnknownPrincipalProps = CdkObjectWrappers.wrap(cdkObject) as? UnknownPrincipalProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: UnknownPrincipalProps):
        software.amazon.awscdk.services.iam.UnknownPrincipalProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.UnknownPrincipalProps
  }
}
