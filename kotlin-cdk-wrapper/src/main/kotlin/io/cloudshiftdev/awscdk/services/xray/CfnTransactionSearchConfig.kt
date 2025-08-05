@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.xray

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
 * This schema provides construct and validation rules for AWS-XRay TransactionSearchConfig resource
 * parameters.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.xray.*;
 * CfnTransactionSearchConfig cfnTransactionSearchConfig =
 * CfnTransactionSearchConfig.Builder.create(this, "MyCfnTransactionSearchConfig")
 * .indexingPercentage(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-transactionsearchconfig.html)
 */
public open class CfnTransactionSearchConfig(
  cdkObject: software.amazon.awscdk.services.xray.CfnTransactionSearchConfig,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.xray.CfnTransactionSearchConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransactionSearchConfigProps,
  ) :
      this(software.amazon.awscdk.services.xray.CfnTransactionSearchConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTransactionSearchConfigProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransactionSearchConfigProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTransactionSearchConfigProps(props)
  )

  /**
   * User account id, used as the primary identifier for the resource.
   */
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  /**
   * Determines the percentage of traces indexed from CloudWatch Logs to X-Ray.
   */
  public open fun indexingPercentage(): Number? = unwrap(this).getIndexingPercentage()

  /**
   * Determines the percentage of traces indexed from CloudWatch Logs to X-Ray.
   */
  public open fun indexingPercentage(`value`: Number) {
    unwrap(this).setIndexingPercentage(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.xray.CfnTransactionSearchConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Determines the percentage of traces indexed from CloudWatch Logs to X-Ray.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-transactionsearchconfig.html#cfn-xray-transactionsearchconfig-indexingpercentage)
     * @param indexingPercentage Determines the percentage of traces indexed from CloudWatch Logs to
     * X-Ray. 
     */
    public fun indexingPercentage(indexingPercentage: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.xray.CfnTransactionSearchConfig.Builder
        = software.amazon.awscdk.services.xray.CfnTransactionSearchConfig.Builder.create(scope, id)

    /**
     * Determines the percentage of traces indexed from CloudWatch Logs to X-Ray.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-transactionsearchconfig.html#cfn-xray-transactionsearchconfig-indexingpercentage)
     * @param indexingPercentage Determines the percentage of traces indexed from CloudWatch Logs to
     * X-Ray. 
     */
    override fun indexingPercentage(indexingPercentage: Number) {
      cdkBuilder.indexingPercentage(indexingPercentage)
    }

    public fun build(): software.amazon.awscdk.services.xray.CfnTransactionSearchConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.xray.CfnTransactionSearchConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransactionSearchConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransactionSearchConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnTransactionSearchConfig):
        CfnTransactionSearchConfig = CfnTransactionSearchConfig(cdkObject)

    internal fun unwrap(wrapped: CfnTransactionSearchConfig):
        software.amazon.awscdk.services.xray.CfnTransactionSearchConfig = wrapped.cdkObject as
        software.amazon.awscdk.services.xray.CfnTransactionSearchConfig
  }
}
