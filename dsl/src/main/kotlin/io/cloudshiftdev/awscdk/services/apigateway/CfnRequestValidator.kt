package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRequestValidator internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.CfnRequestValidator,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrRequestValidatorId(): String = unwrap(this).getAttrRequestValidatorId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun restApiId(): String = unwrap(this).getRestApiId()

  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  public open fun validateRequestBody(): Any? = unwrap(this).getValidateRequestBody()

  public open fun validateRequestBody(`value`: Boolean) {
    unwrap(this).setValidateRequestBody(`value`)
  }

  public open fun validateRequestBody(`value`: IResolvable) {
    unwrap(this).setValidateRequestBody(`value`.let(IResolvable::unwrap))
  }

  public open fun validateRequestParameters(): Any? = unwrap(this).getValidateRequestParameters()

  public open fun validateRequestParameters(`value`: Boolean) {
    unwrap(this).setValidateRequestParameters(`value`)
  }

  public open fun validateRequestParameters(`value`: IResolvable) {
    unwrap(this).setValidateRequestParameters(`value`.let(IResolvable::unwrap))
  }

  public interface Builder {
    public fun name(name: String)

    public fun restApiId(restApiId: String)

    public fun validateRequestBody(validateRequestBody: Boolean)

    public fun validateRequestBody(validateRequestBody: IResolvable)

    public fun validateRequestParameters(validateRequestParameters: Boolean)

    public fun validateRequestParameters(validateRequestParameters: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnRequestValidator.Builder =
        software.amazon.awscdk.services.apigateway.CfnRequestValidator.Builder.create(scope, id)

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    override fun validateRequestBody(validateRequestBody: Boolean) {
      cdkBuilder.validateRequestBody(validateRequestBody)
    }

    override fun validateRequestBody(validateRequestBody: IResolvable) {
      cdkBuilder.validateRequestBody(validateRequestBody.let(IResolvable::unwrap))
    }

    override fun validateRequestParameters(validateRequestParameters: Boolean) {
      cdkBuilder.validateRequestParameters(validateRequestParameters)
    }

    override fun validateRequestParameters(validateRequestParameters: IResolvable) {
      cdkBuilder.validateRequestParameters(validateRequestParameters.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnRequestValidator =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
