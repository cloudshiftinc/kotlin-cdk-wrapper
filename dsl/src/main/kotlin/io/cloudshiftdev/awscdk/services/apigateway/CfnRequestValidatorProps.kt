package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnRequestValidatorProps {
  /**
   * The name of this RequestValidator.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-restapiid)
   */
  public fun restApiId(): String

  /**
   * A Boolean flag to indicate whether to validate a request body according to the configured Model
   * schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestbody)
   */
  public fun validateRequestBody(): Any? = unwrap(this).getValidateRequestBody()

  /**
   * A Boolean flag to indicate whether to validate request parameters ( `true` ) or not ( `false`
   * ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestparameters)
   */
  public fun validateRequestParameters(): Any? = unwrap(this).getValidateRequestParameters()

  /**
   * A builder for [CfnRequestValidatorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of this RequestValidator.
     */
    public fun name(name: String)

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)

    /**
     * @param validateRequestBody A Boolean flag to indicate whether to validate a request body
     * according to the configured Model schema.
     */
    public fun validateRequestBody(validateRequestBody: Boolean)

    /**
     * @param validateRequestBody A Boolean flag to indicate whether to validate a request body
     * according to the configured Model schema.
     */
    public fun validateRequestBody(validateRequestBody: IResolvable)

    /**
     * @param validateRequestParameters A Boolean flag to indicate whether to validate request
     * parameters ( `true` ) or not ( `false` ).
     */
    public fun validateRequestParameters(validateRequestParameters: Boolean)

    /**
     * @param validateRequestParameters A Boolean flag to indicate whether to validate request
     * parameters ( `true` ) or not ( `false` ).
     */
    public fun validateRequestParameters(validateRequestParameters: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps.builder()

    /**
     * @param name The name of this RequestValidator.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * @param validateRequestBody A Boolean flag to indicate whether to validate a request body
     * according to the configured Model schema.
     */
    override fun validateRequestBody(validateRequestBody: Boolean) {
      cdkBuilder.validateRequestBody(validateRequestBody)
    }

    /**
     * @param validateRequestBody A Boolean flag to indicate whether to validate a request body
     * according to the configured Model schema.
     */
    override fun validateRequestBody(validateRequestBody: IResolvable) {
      cdkBuilder.validateRequestBody(validateRequestBody.let(IResolvable::unwrap))
    }

    /**
     * @param validateRequestParameters A Boolean flag to indicate whether to validate request
     * parameters ( `true` ) or not ( `false` ).
     */
    override fun validateRequestParameters(validateRequestParameters: Boolean) {
      cdkBuilder.validateRequestParameters(validateRequestParameters)
    }

    /**
     * @param validateRequestParameters A Boolean flag to indicate whether to validate request
     * parameters ( `true` ) or not ( `false` ).
     */
    override fun validateRequestParameters(validateRequestParameters: IResolvable) {
      cdkBuilder.validateRequestParameters(validateRequestParameters.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps,
  ) : CdkObject(cdkObject), CfnRequestValidatorProps {
    /**
     * The name of this RequestValidator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-restapiid)
     */
    override fun restApiId(): String = unwrap(this).getRestApiId()

    /**
     * A Boolean flag to indicate whether to validate a request body according to the configured
     * Model schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestbody)
     */
    override fun validateRequestBody(): Any? = unwrap(this).getValidateRequestBody()

    /**
     * A Boolean flag to indicate whether to validate request parameters ( `true` ) or not ( `false`
     * ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestparameters)
     */
    override fun validateRequestParameters(): Any? = unwrap(this).getValidateRequestParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRequestValidatorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps):
        CfnRequestValidatorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRequestValidatorProps):
        software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps
  }
}
