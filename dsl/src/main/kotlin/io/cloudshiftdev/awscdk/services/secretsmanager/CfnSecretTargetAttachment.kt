package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecretTargetAttachment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment,
) : CfnResource(cdkObject), IInspectable {
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
   * The ARN or name of the secret.
   */
  public open fun secretId(): String = unwrap(this).getSecretId()

  /**
   * The ARN or name of the secret.
   */
  public open fun secretId(`value`: String) {
    unwrap(this).setSecretId(`value`)
  }

  /**
   * The ID of the database or cluster.
   */
  public open fun targetId(): String = unwrap(this).getTargetId()

  /**
   * The ID of the database or cluster.
   */
  public open fun targetId(`value`: String) {
    unwrap(this).setTargetId(`value`)
  }

  /**
   * A string that defines the type of service or database associated with the secret.
   */
  public open fun targetType(): String = unwrap(this).getTargetType()

  /**
   * A string that defines the type of service or database associated with the secret.
   */
  public open fun targetType(`value`: String) {
    unwrap(this).setTargetType(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.secretsmanager.CfnSecretTargetAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN or name of the secret.
     *
     * To reference a secret also created in this template, use the see
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
     * function with the secret's logical ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html#cfn-secretsmanager-secrettargetattachment-secretid)
     * @param secretId The ARN or name of the secret. 
     */
    public fun secretId(secretId: String)

    /**
     * The ID of the database or cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html#cfn-secretsmanager-secrettargetattachment-targetid)
     * @param targetId The ID of the database or cluster. 
     */
    public fun targetId(targetId: String)

    /**
     * A string that defines the type of service or database associated with the secret.
     *
     * This value instructs Secrets Manager how to update the secret with the details of the service
     * or database. This value must be one of the following:
     *
     * * AWS::RDS::DBInstance
     * * AWS::RDS::DBCluster
     * * AWS::Redshift::Cluster
     * * AWS::DocDB::DBInstance
     * * AWS::DocDB::DBCluster
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html#cfn-secretsmanager-secrettargetattachment-targettype)
     * @param targetType A string that defines the type of service or database associated with the
     * secret. 
     */
    public fun targetType(targetType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment.Builder =
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment.Builder.create(scope,
        id)

    /**
     * The ARN or name of the secret.
     *
     * To reference a secret also created in this template, use the see
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
     * function with the secret's logical ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html#cfn-secretsmanager-secrettargetattachment-secretid)
     * @param secretId The ARN or name of the secret. 
     */
    override fun secretId(secretId: String) {
      cdkBuilder.secretId(secretId)
    }

    /**
     * The ID of the database or cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html#cfn-secretsmanager-secrettargetattachment-targetid)
     * @param targetId The ID of the database or cluster. 
     */
    override fun targetId(targetId: String) {
      cdkBuilder.targetId(targetId)
    }

    /**
     * A string that defines the type of service or database associated with the secret.
     *
     * This value instructs Secrets Manager how to update the secret with the details of the service
     * or database. This value must be one of the following:
     *
     * * AWS::RDS::DBInstance
     * * AWS::RDS::DBCluster
     * * AWS::Redshift::Cluster
     * * AWS::DocDB::DBInstance
     * * AWS::DocDB::DBCluster
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html#cfn-secretsmanager-secrettargetattachment-targettype)
     * @param targetType A string that defines the type of service or database associated with the
     * secret. 
     */
    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecretTargetAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecretTargetAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment):
        CfnSecretTargetAttachment = CfnSecretTargetAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnSecretTargetAttachment):
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment = wrapped.cdkObject
  }
}
