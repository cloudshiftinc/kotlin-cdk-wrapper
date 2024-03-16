@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Information needed to access an IAM role created as part of the bootstrap process.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * BootstrapRole bootstrapRole = BootstrapRole.builder()
 * .arn("arn")
 * // the properties below are optional
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
 * .requiresBootstrapStackVersion(123)
 * .build();
 * ```
 */
public interface BootstrapRole {
  /**
   * The ARN of the IAM role created as part of bootrapping e.g. lookupRoleArn.
   */
  public fun arn(): String

  /**
   * External ID to use when assuming the bootstrap role.
   *
   * Default: - No external ID
   */
  public fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

  /**
   * Name of SSM parameter with bootstrap stack version.
   *
   * Default: - Discover SSM parameter by reading stack
   */
  public fun bootstrapStackVersionSsmParameter(): String? =
      unwrap(this).getBootstrapStackVersionSsmParameter()

  /**
   * Version of bootstrap stack required to use this role.
   *
   * Default: - No bootstrap stack required
   */
  public fun requiresBootstrapStackVersion(): Number? =
      unwrap(this).getRequiresBootstrapStackVersion()

  /**
   * A builder for [BootstrapRole]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param arn The ARN of the IAM role created as part of bootrapping e.g. lookupRoleArn. 
     */
    public fun arn(arn: String)

    /**
     * @param assumeRoleExternalId External ID to use when assuming the bootstrap role.
     */
    public fun assumeRoleExternalId(assumeRoleExternalId: String)

    /**
     * @param bootstrapStackVersionSsmParameter Name of SSM parameter with bootstrap stack version.
     */
    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String)

    /**
     * @param requiresBootstrapStackVersion Version of bootstrap stack required to use this role.
     */
    public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.BootstrapRole.Builder =
        software.amazon.awscdk.cloudassembly.schema.BootstrapRole.builder()

    /**
     * @param arn The ARN of the IAM role created as part of bootrapping e.g. lookupRoleArn. 
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * @param assumeRoleExternalId External ID to use when assuming the bootstrap role.
     */
    override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    /**
     * @param bootstrapStackVersionSsmParameter Name of SSM parameter with bootstrap stack version.
     */
    override fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
      cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    /**
     * @param requiresBootstrapStackVersion Version of bootstrap stack required to use this role.
     */
    override fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
      cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.BootstrapRole =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.BootstrapRole,
  ) : CdkObject(cdkObject), BootstrapRole {
    /**
     * The ARN of the IAM role created as part of bootrapping e.g. lookupRoleArn.
     */
    override fun arn(): String = unwrap(this).getArn()

    /**
     * External ID to use when assuming the bootstrap role.
     *
     * Default: - No external ID
     */
    override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

    /**
     * Name of SSM parameter with bootstrap stack version.
     *
     * Default: - Discover SSM parameter by reading stack
     */
    override fun bootstrapStackVersionSsmParameter(): String? =
        unwrap(this).getBootstrapStackVersionSsmParameter()

    /**
     * Version of bootstrap stack required to use this role.
     *
     * Default: - No bootstrap stack required
     */
    override fun requiresBootstrapStackVersion(): Number? =
        unwrap(this).getRequiresBootstrapStackVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BootstrapRole {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.BootstrapRole):
        BootstrapRole = CdkObjectWrappers.wrap(cdkObject) as BootstrapRole

    internal fun unwrap(wrapped: BootstrapRole):
        software.amazon.awscdk.cloudassembly.schema.BootstrapRole = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloudassembly.schema.BootstrapRole
  }
}
