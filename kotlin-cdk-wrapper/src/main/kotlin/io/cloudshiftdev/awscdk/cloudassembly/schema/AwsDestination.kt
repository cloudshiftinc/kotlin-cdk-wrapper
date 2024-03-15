@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Destination for assets that need to be uploaded to AWS.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * AwsDestination awsDestination = AwsDestination.builder()
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .region("region")
 * .build();
 * ```
 */
public interface AwsDestination {
  /**
   * The role that needs to be assumed while publishing this asset.
   *
   * Default: - No role will be assumed
   */
  public fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

  /**
   * The ExternalId that needs to be supplied while assuming this role.
   *
   * Default: - No ExternalId will be supplied
   */
  public fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

  /**
   * The region where this asset will need to be published.
   *
   * Default: - Current region
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * A builder for [AwsDestination]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assumeRoleArn The role that needs to be assumed while publishing this asset.
     */
    public fun assumeRoleArn(assumeRoleArn: String)

    /**
     * @param assumeRoleExternalId The ExternalId that needs to be supplied while assuming this
     * role.
     */
    public fun assumeRoleExternalId(assumeRoleExternalId: String)

    /**
     * @param region The region where this asset will need to be published.
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.AwsDestination.Builder =
        software.amazon.awscdk.cloudassembly.schema.AwsDestination.builder()

    /**
     * @param assumeRoleArn The role that needs to be assumed while publishing this asset.
     */
    override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    /**
     * @param assumeRoleExternalId The ExternalId that needs to be supplied while assuming this
     * role.
     */
    override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    /**
     * @param region The region where this asset will need to be published.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AwsDestination =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.AwsDestination,
  ) : CdkObject(cdkObject), AwsDestination {
    /**
     * The role that needs to be assumed while publishing this asset.
     *
     * Default: - No role will be assumed
     */
    override fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

    /**
     * The ExternalId that needs to be supplied while assuming this role.
     *
     * Default: - No ExternalId will be supplied
     */
    override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

    /**
     * The region where this asset will need to be published.
     *
     * Default: - Current region
     */
    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsDestination {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AwsDestination):
        AwsDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsDestination):
        software.amazon.awscdk.cloudassembly.schema.AwsDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.AwsDestination
  }
}
