@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

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
 * The `AWS::LakeFormation::Tag` resource represents an LF-tag, which consists of a key and one or
 * more possible values for the key.
 *
 * During a stack operation, AWS CloudFormation calls the AWS Lake Formation `CreateLFTag` API to
 * create a tag, and `UpdateLFTag` API to update a tag resource, and a `DeleteLFTag` to delete it.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.S3Table;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.Database;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.DataFormat;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.Schema;
 * import io.cloudshiftdev.awscdk.services.lakeformation.CfnDataLakeSettings;
 * import io.cloudshiftdev.awscdk.services.lakeformation.CfnTag;
 * import io.cloudshiftdev.awscdk.services.lakeformation.CfnTagAssociation;
 * Stack stack;
 * String accountId;
 * String tagKey = "aws";
 * String[] tagValues = List.of("dev");
 * Database database = new Database(this, "Database");
 * S3Table table = S3Table.Builder.create(this, "Table")
 * .database(database)
 * .columns(List.of(Column.builder()
 * .name("col1")
 * .type(Schema.STRING)
 * .build(), Column.builder()
 * .name("col2")
 * .type(Schema.STRING)
 * .build()))
 * .dataFormat(DataFormat.CSV)
 * .build();
 * DefaultStackSynthesizer synthesizer = (DefaultStackSynthesizer)stack.getSynthesizer();
 * CfnDataLakeSettings.Builder.create(this, "DataLakeSettings")
 * .admins(List.of(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier(stack.formatArn(ArnComponents.builder()
 * .service("iam")
 * .resource("role")
 * .region("")
 * .account(accountId)
 * .resourceName("Admin")
 * .build()))
 * .build(), DataLakePrincipalProperty.builder()
 * // The CDK cloudformation execution role.
 * .dataLakePrincipalIdentifier(synthesizer.cloudFormationExecutionRoleArn.replace("${AWS::Partition}",
 * "aws"))
 * .build()))
 * .build();
 * CfnTag tag = CfnTag.Builder.create(this, "Tag")
 * .catalogId(accountId)
 * .tagKey(tagKey)
 * .tagValues(tagValues)
 * .build();
 * LFTagPairProperty lfTagPairProperty = LFTagPairProperty.builder()
 * .catalogId(accountId)
 * .tagKey(tagKey)
 * .tagValues(tagValues)
 * .build();
 * CfnTagAssociation tagAssociation = CfnTagAssociation.Builder.create(this, "TagAssociation")
 * .lfTags(List.of(lfTagPairProperty))
 * .resource(ResourceProperty.builder()
 * .tableWithColumns(TableWithColumnsResourceProperty.builder()
 * .databaseName(database.getDatabaseName())
 * .columnNames(List.of("col1", "col2"))
 * .catalogId(accountId)
 * .name(table.getTableName())
 * .build())
 * .build())
 * .build();
 * tagAssociation.node.addDependency(tag);
 * tagAssociation.node.addDependency(table);
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html)
 */
public open class CfnTag internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lakeformation.CfnTag,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTagProps,
  ) :
      this(software.amazon.awscdk.services.lakeformation.CfnTag(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTagProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTagProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTagProps(props)
  )

  /**
   * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
   * string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun catalogId(): String? = unwrap(this).getCatalogId()

  /**
   * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
   * string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun tagKey(): String = unwrap(this).getTagKey()

  /**
   * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun tagKey(`value`: String) {
    unwrap(this).setTagKey(`value`)
  }

  /**
   * An array of UTF-8 strings, not less than 1 or more than 50 strings.
   */
  public open fun tagValues(): List<String> = unwrap(this).getTagValues()

  /**
   * An array of UTF-8 strings, not less than 1 or more than 50 strings.
   */
  public open fun tagValues(`value`: List<String>) {
    unwrap(this).setTagValues(`value`)
  }

  /**
   * An array of UTF-8 strings, not less than 1 or more than 50 strings.
   */
  public open fun tagValues(vararg `value`: String): Unit = tagValues(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lakeformation.CfnTag].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
     * string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The identifier for the Data Catalog . By default, the account ID. The Data Catalog is the
     * persistent metadata store. It contains database definitions, table definitions, and other
     * control information to manage your AWS Lake Formation environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-catalogid)
     * @param catalogId Catalog id string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     */
    public fun catalogId(catalogId: String)

    /**
     * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The key-name for the LF-tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagkey)
     * @param tagKey UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     */
    public fun tagKey(tagKey: String)

    /**
     * An array of UTF-8 strings, not less than 1 or more than 50 strings.
     *
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagvalues)
     * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings. 
     */
    public fun tagValues(tagValues: List<String>)

    /**
     * An array of UTF-8 strings, not less than 1 or more than 50 strings.
     *
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagvalues)
     * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings. 
     */
    public fun tagValues(vararg tagValues: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lakeformation.CfnTag.Builder =
        software.amazon.awscdk.services.lakeformation.CfnTag.Builder.create(scope, id)

    /**
     * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
     * string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The identifier for the Data Catalog . By default, the account ID. The Data Catalog is the
     * persistent metadata store. It contains database definitions, table definitions, and other
     * control information to manage your AWS Lake Formation environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-catalogid)
     * @param catalogId Catalog id string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The key-name for the LF-tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagkey)
     * @param tagKey UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     */
    override fun tagKey(tagKey: String) {
      cdkBuilder.tagKey(tagKey)
    }

    /**
     * An array of UTF-8 strings, not less than 1 or more than 50 strings.
     *
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagvalues)
     * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings. 
     */
    override fun tagValues(tagValues: List<String>) {
      cdkBuilder.tagValues(tagValues)
    }

    /**
     * An array of UTF-8 strings, not less than 1 or more than 50 strings.
     *
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagvalues)
     * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings. 
     */
    override fun tagValues(vararg tagValues: String): Unit = tagValues(tagValues.toList())

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnTag = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lakeformation.CfnTag.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTag {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTag(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTag): CfnTag =
        CfnTag(cdkObject)

    internal fun unwrap(wrapped: CfnTag): software.amazon.awscdk.services.lakeformation.CfnTag =
        wrapped.cdkObject
  }
}
