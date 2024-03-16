@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * Properties for a CrossAccountDestination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * Role role;
 * CrossAccountDestinationProps crossAccountDestinationProps =
 * CrossAccountDestinationProps.builder()
 * .role(role)
 * .targetArn("targetArn")
 * // the properties below are optional
 * .destinationName("destinationName")
 * .build();
 * ```
 */
public interface CrossAccountDestinationProps {
  /**
   * The name of the log destination.
   *
   * Default: Automatically generated
   */
  public fun destinationName(): String? = unwrap(this).getDestinationName()

  /**
   * The role to assume that grants permissions to write to 'target'.
   *
   * The role must be assumable by 'logs.{REGION}.amazonaws.com'.
   */
  public fun role(): IRole

  /**
   * The log destination target's ARN.
   */
  public fun targetArn(): String

  /**
   * A builder for [CrossAccountDestinationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationName The name of the log destination.
     */
    public fun destinationName(destinationName: String)

    /**
     * @param role The role to assume that grants permissions to write to 'target'. 
     * The role must be assumable by 'logs.{REGION}.amazonaws.com'.
     */
    public fun role(role: IRole)

    /**
     * @param targetArn The log destination target's ARN. 
     */
    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.logs.CrossAccountDestinationProps.Builder =
        software.amazon.awscdk.services.logs.CrossAccountDestinationProps.builder()

    /**
     * @param destinationName The name of the log destination.
     */
    override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    /**
     * @param role The role to assume that grants permissions to write to 'target'. 
     * The role must be assumable by 'logs.{REGION}.amazonaws.com'.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param targetArn The log destination target's ARN. 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.logs.CrossAccountDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CrossAccountDestinationProps,
  ) : CdkObject(cdkObject), CrossAccountDestinationProps {
    /**
     * The name of the log destination.
     *
     * Default: Automatically generated
     */
    override fun destinationName(): String? = unwrap(this).getDestinationName()

    /**
     * The role to assume that grants permissions to write to 'target'.
     *
     * The role must be assumable by 'logs.{REGION}.amazonaws.com'.
     */
    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

    /**
     * The log destination target's ARN.
     */
    override fun targetArn(): String = unwrap(this).getTargetArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CrossAccountDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CrossAccountDestinationProps):
        CrossAccountDestinationProps = CdkObjectWrappers.wrap(cdkObject) as
        CrossAccountDestinationProps

    internal fun unwrap(wrapped: CrossAccountDestinationProps):
        software.amazon.awscdk.services.logs.CrossAccountDestinationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CrossAccountDestinationProps
  }
}
