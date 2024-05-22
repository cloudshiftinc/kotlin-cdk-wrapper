@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AppSync::ApiKey` resource creates a unique key that you can distribute to clients who
 * are executing GraphQL operations with AWS AppSync that require an API key.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * CfnApiKey cfnApiKey = CfnApiKey.Builder.create(this, "MyCfnApiKey")
 * .apiId("apiId")
 * // the properties below are optional
 * .description("description")
 * .expires(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html)
 */
public open class CfnApiKey(
  cdkObject: software.amazon.awscdk.services.appsync.CfnApiKey,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApiKeyProps,
  ) :
      this(software.amazon.awscdk.services.appsync.CfnApiKey(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApiKeyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApiKeyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApiKeyProps(props)
  )

  /**
   * Unique AWS AppSync GraphQL API ID for this API key.
   */
  public open fun apiId(): String = unwrap(this).getApiId()

  /**
   * Unique AWS AppSync GraphQL API ID for this API key.
   */
  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  /**
   * The API key.
   */
  public open fun attrApiKey(): String = unwrap(this).getAttrApiKey()

  /**
   * The API key ID.
   */
  public open fun attrApiKeyId(): String = unwrap(this).getAttrApiKeyId()

  /**
   * The Amazon Resource Name (ARN) of the API key, such as
   * `arn:aws:appsync:us-east-1:123456789012:apis/graphqlapiid/apikey/apikeya1bzhi` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Unique description of your API key.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Unique description of your API key.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The time after which the API key expires.
   */
  public open fun expires(): Number? = unwrap(this).getExpires()

  /**
   * The time after which the API key expires.
   */
  public open fun expires(`value`: Number) {
    unwrap(this).setExpires(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.CfnApiKey].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Unique AWS AppSync GraphQL API ID for this API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-apiid)
     * @param apiId Unique AWS AppSync GraphQL API ID for this API key. 
     */
    public fun apiId(apiId: String)

    /**
     * Unique description of your API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-description)
     * @param description Unique description of your API key. 
     */
    public fun description(description: String)

    /**
     * The time after which the API key expires.
     *
     * The date is represented as seconds since the epoch, rounded down to the nearest hour.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-expires)
     * @param expires The time after which the API key expires. 
     */
    public fun expires(expires: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnApiKey.Builder =
        software.amazon.awscdk.services.appsync.CfnApiKey.Builder.create(scope, id)

    /**
     * Unique AWS AppSync GraphQL API ID for this API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-apiid)
     * @param apiId Unique AWS AppSync GraphQL API ID for this API key. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * Unique description of your API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-description)
     * @param description Unique description of your API key. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The time after which the API key expires.
     *
     * The date is represented as seconds since the epoch, rounded down to the nearest hour.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-expires)
     * @param expires The time after which the API key expires. 
     */
    override fun expires(expires: Number) {
      cdkBuilder.expires(expires)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnApiKey = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appsync.CfnApiKey.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApiKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApiKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnApiKey): CfnApiKey =
        CfnApiKey(cdkObject)

    internal fun unwrap(wrapped: CfnApiKey): software.amazon.awscdk.services.appsync.CfnApiKey =
        wrapped.cdkObject as software.amazon.awscdk.services.appsync.CfnApiKey
  }
}
