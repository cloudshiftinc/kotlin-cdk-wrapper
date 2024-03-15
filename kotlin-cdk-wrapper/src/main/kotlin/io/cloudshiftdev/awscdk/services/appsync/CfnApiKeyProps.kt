@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnApiKey`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * CfnApiKeyProps cfnApiKeyProps = CfnApiKeyProps.builder()
 * .apiId("apiId")
 * // the properties below are optional
 * .description("description")
 * .expires(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html)
 */
public interface CfnApiKeyProps {
  /**
   * Unique AWS AppSync GraphQL API ID for this API key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-apiid)
   */
  public fun apiId(): String

  /**
   * Unique description of your API key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The time after which the API key expires.
   *
   * The date is represented as seconds since the epoch, rounded down to the nearest hour.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-expires)
   */
  public fun expires(): Number? = unwrap(this).getExpires()

  /**
   * A builder for [CfnApiKeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId Unique AWS AppSync GraphQL API ID for this API key. 
     */
    public fun apiId(apiId: String)

    /**
     * @param description Unique description of your API key.
     */
    public fun description(description: String)

    /**
     * @param expires The time after which the API key expires.
     * The date is represented as seconds since the epoch, rounded down to the nearest hour.
     */
    public fun expires(expires: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnApiKeyProps.Builder =
        software.amazon.awscdk.services.appsync.CfnApiKeyProps.builder()

    /**
     * @param apiId Unique AWS AppSync GraphQL API ID for this API key. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param description Unique description of your API key.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param expires The time after which the API key expires.
     * The date is represented as seconds since the epoch, rounded down to the nearest hour.
     */
    override fun expires(expires: Number) {
      cdkBuilder.expires(expires)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnApiKeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.CfnApiKeyProps,
  ) : CdkObject(cdkObject), CfnApiKeyProps {
    /**
     * Unique AWS AppSync GraphQL API ID for this API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * Unique description of your API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The time after which the API key expires.
     *
     * The date is represented as seconds since the epoch, rounded down to the nearest hour.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-expires)
     */
    override fun expires(): Number? = unwrap(this).getExpires()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnApiKeyProps):
        CfnApiKeyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiKeyProps):
        software.amazon.awscdk.services.appsync.CfnApiKeyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.CfnApiKeyProps
  }
}
