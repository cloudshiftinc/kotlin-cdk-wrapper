@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.timestream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new Timestream database.
 *
 * If the AWS KMS key is not specified, the database will be encrypted with a Timestream managed AWS
 * KMS key located in your account. Refer to [AWS managed AWS KMS
 * keys](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk) for more
 * info. [Service quotas
 * apply](https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html) . See [code
 * sample](https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.create-db.html)
 * for details.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.timestream.*;
 * CfnDatabase cfnDatabase = CfnDatabase.Builder.create(this, "MyCfnDatabase")
 * .databaseName("databaseName")
 * .kmsKeyId("kmsKeyId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html)
 */
public open class CfnDatabase(
  cdkObject: software.amazon.awscdk.services.timestream.CfnDatabase,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.timestream.CfnDatabase(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDatabaseProps,
  ) :
      this(software.amazon.awscdk.services.timestream.CfnDatabase(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDatabaseProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDatabaseProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDatabaseProps(props)
  )

  /**
   * The `arn` of the database.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of the Timestream database.
   */
  public open fun databaseName(): String? = unwrap(this).getDatabaseName()

  /**
   * The name of the Timestream database.
   */
  public open fun databaseName(`value`: String) {
    unwrap(this).setDatabaseName(`value`)
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
   * The identifier of the AWS KMS key used to encrypt the data stored in the database.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The identifier of the AWS KMS key used to encrypt the data stored in the database.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to add to the database.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to add to the database.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to add to the database.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.timestream.CfnDatabase].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Timestream database.
     *
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-databasename)
     * @param databaseName The name of the Timestream database. 
     */
    public fun databaseName(databaseName: String)

    /**
     * The identifier of the AWS KMS key used to encrypt the data stored in the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-kmskeyid)
     * @param kmsKeyId The identifier of the AWS KMS key used to encrypt the data stored in the
     * database. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The tags to add to the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-tags)
     * @param tags The tags to add to the database. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to add to the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-tags)
     * @param tags The tags to add to the database. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.timestream.CfnDatabase.Builder =
        software.amazon.awscdk.services.timestream.CfnDatabase.Builder.create(scope, id)

    /**
     * The name of the Timestream database.
     *
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-databasename)
     * @param databaseName The name of the Timestream database. 
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * The identifier of the AWS KMS key used to encrypt the data stored in the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-kmskeyid)
     * @param kmsKeyId The identifier of the AWS KMS key used to encrypt the data stored in the
     * database. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The tags to add to the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-tags)
     * @param tags The tags to add to the database. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to add to the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-tags)
     * @param tags The tags to add to the database. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.timestream.CfnDatabase = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.timestream.CfnDatabase.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDatabase {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDatabase(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnDatabase):
        CfnDatabase = CfnDatabase(cdkObject)

    internal fun unwrap(wrapped: CfnDatabase):
        software.amazon.awscdk.services.timestream.CfnDatabase = wrapped.cdkObject as
        software.amazon.awscdk.services.timestream.CfnDatabase
  }
}
