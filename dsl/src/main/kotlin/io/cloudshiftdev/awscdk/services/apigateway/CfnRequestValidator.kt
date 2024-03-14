package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRequestValidator internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.CfnRequestValidator,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ID for the request validator.
   *
   * For example: `abc123` .
   */
  public open fun attrRequestValidatorId(): String = unwrap(this).getAttrRequestValidatorId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of this RequestValidator.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of this RequestValidator.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(): String = unwrap(this).getRestApiId()

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  /**
   * A Boolean flag to indicate whether to validate a request body according to the configured Model
   * schema.
   */
  public open fun validateRequestBody(): Any? = unwrap(this).getValidateRequestBody()

  /**
   * A Boolean flag to indicate whether to validate a request body according to the configured Model
   * schema.
   */
  public open fun validateRequestBody(`value`: Boolean) {
    unwrap(this).setValidateRequestBody(`value`)
  }

  /**
   * A Boolean flag to indicate whether to validate a request body according to the configured Model
   * schema.
   */
  public open fun validateRequestBody(`value`: IResolvable) {
    unwrap(this).setValidateRequestBody(`value`.let(IResolvable::unwrap))
  }

  /**
   * A Boolean flag to indicate whether to validate request parameters ( `true` ) or not ( `false`
   * ).
   */
  public open fun validateRequestParameters(): Any? = unwrap(this).getValidateRequestParameters()

  /**
   * A Boolean flag to indicate whether to validate request parameters ( `true` ) or not ( `false`
   * ).
   */
  public open fun validateRequestParameters(`value`: Boolean) {
    unwrap(this).setValidateRequestParameters(`value`)
  }

  /**
   * A Boolean flag to indicate whether to validate request parameters ( `true` ) or not ( `false`
   * ).
   */
  public open fun validateRequestParameters(`value`: IResolvable) {
    unwrap(this).setValidateRequestParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnRequestValidator].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of this RequestValidator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-name)
     * @param name The name of this RequestValidator. 
     */
    public fun name(name: String)

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)

    /**
     * A Boolean flag to indicate whether to validate a request body according to the configured
     * Model schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestbody)
     * @param validateRequestBody A Boolean flag to indicate whether to validate a request body
     * according to the configured Model schema. 
     */
    public fun validateRequestBody(validateRequestBody: Boolean)

    /**
     * A Boolean flag to indicate whether to validate a request body according to the configured
     * Model schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestbody)
     * @param validateRequestBody A Boolean flag to indicate whether to validate a request body
     * according to the configured Model schema. 
     */
    public fun validateRequestBody(validateRequestBody: IResolvable)

    /**
     * A Boolean flag to indicate whether to validate request parameters ( `true` ) or not ( `false`
     * ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestparameters)
     * @param validateRequestParameters A Boolean flag to indicate whether to validate request
     * parameters ( `true` ) or not ( `false` ). 
     */
    public fun validateRequestParameters(validateRequestParameters: Boolean)

    /**
     * A Boolean flag to indicate whether to validate request parameters ( `true` ) or not ( `false`
     * ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestparameters)
     * @param validateRequestParameters A Boolean flag to indicate whether to validate request
     * parameters ( `true` ) or not ( `false` ). 
     */
    public fun validateRequestParameters(validateRequestParameters: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnRequestValidator.Builder =
        software.amazon.awscdk.services.apigateway.CfnRequestValidator.Builder.create(scope, id)

    /**
     * The name of this RequestValidator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-name)
     * @param name The name of this RequestValidator. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * A Boolean flag to indicate whether to validate a request body according to the configured
     * Model schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestbody)
     * @param validateRequestBody A Boolean flag to indicate whether to validate a request body
     * according to the configured Model schema. 
     */
    override fun validateRequestBody(validateRequestBody: Boolean) {
      cdkBuilder.validateRequestBody(validateRequestBody)
    }

    /**
     * A Boolean flag to indicate whether to validate a request body according to the configured
     * Model schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestbody)
     * @param validateRequestBody A Boolean flag to indicate whether to validate a request body
     * according to the configured Model schema. 
     */
    override fun validateRequestBody(validateRequestBody: IResolvable) {
      cdkBuilder.validateRequestBody(validateRequestBody.let(IResolvable::unwrap))
    }

    /**
     * A Boolean flag to indicate whether to validate request parameters ( `true` ) or not ( `false`
     * ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestparameters)
     * @param validateRequestParameters A Boolean flag to indicate whether to validate request
     * parameters ( `true` ) or not ( `false` ). 
     */
    override fun validateRequestParameters(validateRequestParameters: Boolean) {
      cdkBuilder.validateRequestParameters(validateRequestParameters)
    }

    /**
     * A Boolean flag to indicate whether to validate request parameters ( `true` ) or not ( `false`
     * ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestparameters)
     * @param validateRequestParameters A Boolean flag to indicate whether to validate request
     * parameters ( `true` ) or not ( `false` ). 
     */
    override fun validateRequestParameters(validateRequestParameters: IResolvable) {
      cdkBuilder.validateRequestParameters(validateRequestParameters.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnRequestValidator =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnRequestValidator.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRequestValidator {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRequestValidator(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnRequestValidator):
        CfnRequestValidator = CfnRequestValidator(cdkObject)

    internal fun unwrap(wrapped: CfnRequestValidator):
        software.amazon.awscdk.services.apigateway.CfnRequestValidator = wrapped.cdkObject
  }
}
