@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Construction properties for a ResourcePolicy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
 * Secret secret;
 * ResourcePolicyProps resourcePolicyProps = ResourcePolicyProps.builder()
 * .secret(secret)
 * .build();
 * ```
 */
public interface ResourcePolicyProps {
  /**
   * The secret to attach a resource-based permissions policy.
   */
  public fun secret(): ISecret

  /**
   * A builder for [ResourcePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param secret The secret to attach a resource-based permissions policy. 
     */
    public fun secret(secret: ISecret)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps.Builder =
        software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps.builder()

    /**
     * @param secret The secret to attach a resource-based permissions policy. 
     */
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps,
  ) : CdkObject(cdkObject), ResourcePolicyProps {
    /**
     * The secret to attach a resource-based permissions policy.
     */
    override fun secret(): ISecret = unwrap(this).getSecret().let(ISecret::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps):
        ResourcePolicyProps = CdkObjectWrappers.wrap(cdkObject) as? ResourcePolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourcePolicyProps):
        software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps
  }
}
