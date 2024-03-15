@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Options for specifying a role.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * RoleOptions roleOptions = RoleOptions.builder()
 * .assumeRoleArn("assumeRoleArn")
 * // the properties below are optional
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .build();
 * ```
 */
public interface RoleOptions {
  /**
   * ARN of the role to assume.
   */
  public fun assumeRoleArn(): String

  /**
   * External ID to use when assuming the role.
   *
   * Default: - No external ID
   */
  public fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

  /**
   * A builder for [RoleOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assumeRoleArn ARN of the role to assume. 
     */
    public fun assumeRoleArn(assumeRoleArn: String)

    /**
     * @param assumeRoleExternalId External ID to use when assuming the role.
     */
    public fun assumeRoleExternalId(assumeRoleExternalId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.RoleOptions.Builder =
        software.amazon.awscdk.RoleOptions.builder()

    /**
     * @param assumeRoleArn ARN of the role to assume. 
     */
    override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    /**
     * @param assumeRoleExternalId External ID to use when assuming the role.
     */
    override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    public fun build(): software.amazon.awscdk.RoleOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.RoleOptions,
  ) : CdkObject(cdkObject), RoleOptions {
    /**
     * ARN of the role to assume.
     */
    override fun assumeRoleArn(): String = unwrap(this).getAssumeRoleArn()

    /**
     * External ID to use when assuming the role.
     *
     * Default: - No external ID
     */
    override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RoleOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.RoleOptions): RoleOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RoleOptions): software.amazon.awscdk.RoleOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.RoleOptions
  }
}
