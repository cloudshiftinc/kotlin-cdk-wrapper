package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPortfolioPrincipalAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The language code.
   */
  public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * The language code.
   */
  public open fun acceptLanguage(`value`: String) {
    unwrap(this).setAcceptLanguage(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The portfolio identifier.
   */
  public open fun portfolioId(): String = unwrap(this).getPortfolioId()

  /**
   * The portfolio identifier.
   */
  public open fun portfolioId(`value`: String) {
    unwrap(this).setPortfolioId(`value`)
  }

  /**
   * The ARN of the principal ( IAM user, role, or group).
   */
  public open fun principalArn(): String = unwrap(this).getPrincipalArn()

  /**
   * The ARN of the principal ( IAM user, role, or group).
   */
  public open fun principalArn(`value`: String) {
    unwrap(this).setPrincipalArn(`value`)
  }

  /**
   * The principal type.
   */
  public open fun principalType(): String = unwrap(this).getPrincipalType()

  /**
   * The principal type.
   */
  public open fun principalType(`value`: String) {
    unwrap(this).setPrincipalType(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-acceptlanguage)
     * @param acceptLanguage The language code. 
     */
    public fun acceptLanguage(acceptLanguage: String)

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-portfolioid)
     * @param portfolioId The portfolio identifier. 
     */
    public fun portfolioId(portfolioId: String)

    /**
     * The ARN of the principal ( IAM user, role, or group).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principalarn)
     * @param principalArn The ARN of the principal ( IAM user, role, or group). 
     */
    public fun principalArn(principalArn: String)

    /**
     * The principal type.
     *
     * The supported values are `IAM` and `IAM_PATTERN` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principaltype)
     * @param principalType The principal type. 
     */
    public fun principalType(principalType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation.Builder.create(scope,
        id)

    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-acceptlanguage)
     * @param acceptLanguage The language code. 
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-portfolioid)
     * @param portfolioId The portfolio identifier. 
     */
    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    /**
     * The ARN of the principal ( IAM user, role, or group).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principalarn)
     * @param principalArn The ARN of the principal ( IAM user, role, or group). 
     */
    override fun principalArn(principalArn: String) {
      cdkBuilder.principalArn(principalArn)
    }

    /**
     * The principal type.
     *
     * The supported values are `IAM` and `IAM_PATTERN` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principaltype)
     * @param principalType The principal type. 
     */
    override fun principalType(principalType: String) {
      cdkBuilder.principalType(principalType)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPortfolioPrincipalAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPortfolioPrincipalAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation):
        CfnPortfolioPrincipalAssociation = CfnPortfolioPrincipalAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnPortfolioPrincipalAssociation):
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation =
        wrapped.cdkObject
  }
}
