@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a secret stored in the AWS Secrets Manager that can be used to authenticate with a
 * cluster using a user name and a password.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.msk.*;
 * CfnBatchScramSecret cfnBatchScramSecret = CfnBatchScramSecret.Builder.create(this,
 * "MyCfnBatchScramSecret")
 * .clusterArn("clusterArn")
 * // the properties below are optional
 * .secretArnList(List.of("secretArnList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html)
 */
public open class CfnBatchScramSecret(
  cdkObject: software.amazon.awscdk.services.msk.CfnBatchScramSecret,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBatchScramSecretProps,
  ) :
      this(software.amazon.awscdk.services.msk.CfnBatchScramSecret(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnBatchScramSecretProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBatchScramSecretProps.Builder.() -> Unit,
  ) : this(scope, id, CfnBatchScramSecretProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
   */
  public open fun clusterArn(): String = unwrap(this).getClusterArn()

  /**
   * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
   */
  public open fun clusterArn(`value`: String) {
    unwrap(this).setClusterArn(`value`)
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
   * List of Amazon Resource Name (ARN)s of Secrets Manager secrets.
   */
  public open fun secretArnList(): List<String> = unwrap(this).getSecretArnList() ?: emptyList()

  /**
   * List of Amazon Resource Name (ARN)s of Secrets Manager secrets.
   */
  public open fun secretArnList(`value`: List<String>) {
    unwrap(this).setSecretArnList(`value`)
  }

  /**
   * List of Amazon Resource Name (ARN)s of Secrets Manager secrets.
   */
  public open fun secretArnList(vararg `value`: String): Unit = secretArnList(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.msk.CfnBatchScramSecret].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-clusterarn)
     * @param clusterArn The Amazon Resource Name (ARN) that uniquely identifies the cluster. 
     */
    public fun clusterArn(clusterArn: String)

    /**
     * List of Amazon Resource Name (ARN)s of Secrets Manager secrets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-secretarnlist)
     * @param secretArnList List of Amazon Resource Name (ARN)s of Secrets Manager secrets. 
     */
    public fun secretArnList(secretArnList: List<String>)

    /**
     * List of Amazon Resource Name (ARN)s of Secrets Manager secrets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-secretarnlist)
     * @param secretArnList List of Amazon Resource Name (ARN)s of Secrets Manager secrets. 
     */
    public fun secretArnList(vararg secretArnList: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnBatchScramSecret.Builder =
        software.amazon.awscdk.services.msk.CfnBatchScramSecret.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-clusterarn)
     * @param clusterArn The Amazon Resource Name (ARN) that uniquely identifies the cluster. 
     */
    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    /**
     * List of Amazon Resource Name (ARN)s of Secrets Manager secrets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-secretarnlist)
     * @param secretArnList List of Amazon Resource Name (ARN)s of Secrets Manager secrets. 
     */
    override fun secretArnList(secretArnList: List<String>) {
      cdkBuilder.secretArnList(secretArnList)
    }

    /**
     * List of Amazon Resource Name (ARN)s of Secrets Manager secrets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-secretarnlist)
     * @param secretArnList List of Amazon Resource Name (ARN)s of Secrets Manager secrets. 
     */
    override fun secretArnList(vararg secretArnList: String): Unit =
        secretArnList(secretArnList.toList())

    public fun build(): software.amazon.awscdk.services.msk.CfnBatchScramSecret = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.msk.CfnBatchScramSecret.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBatchScramSecret {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBatchScramSecret(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnBatchScramSecret):
        CfnBatchScramSecret = CfnBatchScramSecret(cdkObject)

    internal fun unwrap(wrapped: CfnBatchScramSecret):
        software.amazon.awscdk.services.msk.CfnBatchScramSecret = wrapped.cdkObject as
        software.amazon.awscdk.services.msk.CfnBatchScramSecret
  }
}
