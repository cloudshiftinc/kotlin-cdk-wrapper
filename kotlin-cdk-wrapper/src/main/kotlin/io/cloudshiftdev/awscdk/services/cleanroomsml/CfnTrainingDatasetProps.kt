@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanroomsml

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnTrainingDataset`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanroomsml.*;
 * CfnTrainingDatasetProps cfnTrainingDatasetProps = CfnTrainingDatasetProps.builder()
 * .name("name")
 * .roleArn("roleArn")
 * .trainingData(List.of(DatasetProperty.builder()
 * .inputConfig(DatasetInputConfigProperty.builder()
 * .dataSource(DataSourceProperty.builder()
 * .glueDataSource(GlueDataSourceProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * // the properties below are optional
 * .catalogId("catalogId")
 * .build())
 * .build())
 * .schema(List.of(ColumnSchemaProperty.builder()
 * .columnName("columnName")
 * .columnTypes(List.of("columnTypes"))
 * .build()))
 * .build())
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html)
 */
public interface CfnTrainingDatasetProps {
  /**
   * The description of the training dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the training dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-name)
   */
  public fun name(): String

  /**
   * The ARN of the IAM role that Clean Rooms ML can assume to read the data referred to in the
   * `dataSource` field of each dataset.
   *
   * Passing a role across accounts is not allowed. If you pass a role that isn't in your account,
   * you get an `AccessDeniedException` error.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-rolearn)
   */
  public fun roleArn(): String

  /**
   * The optional metadata that you apply to the resource to help you categorize and organize them.
   *
   * Each tag consists of a key and an optional value, both of which you define.
   *
   * The following basic restrictions apply to tags:
   *
   * * Maximum number of tags per resource - 50.
   * * For each resource, each tag key must be unique, and each tag key can have only one value.
   * * Maximum key length - 128 Unicode characters in UTF-8.
   * * Maximum value length - 256 Unicode characters in UTF-8.
   * * If your tagging schema is used across multiple services and resources, remember that other
   * services may have restrictions on allowed characters. Generally allowed characters are: letters,
   * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of information that lists the Dataset objects, which specifies the dataset type and
   * details on its location and schema.
   *
   * You must provide a role that has read access to these tables.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-trainingdata)
   */
  public fun trainingData(): Any

  /**
   * A builder for [CfnTrainingDatasetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the training dataset.
     */
    public fun description(description: String)

    /**
     * @param name The name of the training dataset. 
     */
    public fun name(name: String)

    /**
     * @param roleArn The ARN of the IAM role that Clean Rooms ML can assume to read the data
     * referred to in the `dataSource` field of each dataset. 
     * Passing a role across accounts is not allowed. If you pass a role that isn't in your account,
     * you get an `AccessDeniedException` error.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags The optional metadata that you apply to the resource to help you categorize and
     * organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50.
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8.
     * * Maximum value length - 256 Unicode characters in UTF-8.
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The optional metadata that you apply to the resource to help you categorize and
     * organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50.
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8.
     * * Maximum value length - 256 Unicode characters in UTF-8.
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param trainingData An array of information that lists the Dataset objects, which specifies
     * the dataset type and details on its location and schema. 
     * You must provide a role that has read access to these tables.
     */
    public fun trainingData(trainingData: IResolvable)

    /**
     * @param trainingData An array of information that lists the Dataset objects, which specifies
     * the dataset type and details on its location and schema. 
     * You must provide a role that has read access to these tables.
     */
    public fun trainingData(trainingData: List<Any>)

    /**
     * @param trainingData An array of information that lists the Dataset objects, which specifies
     * the dataset type and details on its location and schema. 
     * You must provide a role that has read access to these tables.
     */
    public fun trainingData(vararg trainingData: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanroomsml.CfnTrainingDatasetProps.Builder =
        software.amazon.awscdk.services.cleanroomsml.CfnTrainingDatasetProps.builder()

    /**
     * @param description The description of the training dataset.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the training dataset. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The ARN of the IAM role that Clean Rooms ML can assume to read the data
     * referred to in the `dataSource` field of each dataset. 
     * Passing a role across accounts is not allowed. If you pass a role that isn't in your account,
     * you get an `AccessDeniedException` error.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags The optional metadata that you apply to the resource to help you categorize and
     * organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50.
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8.
     * * Maximum value length - 256 Unicode characters in UTF-8.
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The optional metadata that you apply to the resource to help you categorize and
     * organize them.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50.
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8.
     * * Maximum value length - 256 Unicode characters in UTF-8.
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param trainingData An array of information that lists the Dataset objects, which specifies
     * the dataset type and details on its location and schema. 
     * You must provide a role that has read access to these tables.
     */
    override fun trainingData(trainingData: IResolvable) {
      cdkBuilder.trainingData(trainingData.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param trainingData An array of information that lists the Dataset objects, which specifies
     * the dataset type and details on its location and schema. 
     * You must provide a role that has read access to these tables.
     */
    override fun trainingData(trainingData: List<Any>) {
      cdkBuilder.trainingData(trainingData.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param trainingData An array of information that lists the Dataset objects, which specifies
     * the dataset type and details on its location and schema. 
     * You must provide a role that has read access to these tables.
     */
    override fun trainingData(vararg trainingData: Any): Unit = trainingData(trainingData.toList())

    public fun build(): software.amazon.awscdk.services.cleanroomsml.CfnTrainingDatasetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cleanroomsml.CfnTrainingDatasetProps,
  ) : CdkObject(cdkObject),
      CfnTrainingDatasetProps {
    /**
     * The description of the training dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the training dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The ARN of the IAM role that Clean Rooms ML can assume to read the data referred to in the
     * `dataSource` field of each dataset.
     *
     * Passing a role across accounts is not allowed. If you pass a role that isn't in your account,
     * you get an `AccessDeniedException` error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The optional metadata that you apply to the resource to help you categorize and organize
     * them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50.
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8.
     * * Maximum value length - 256 Unicode characters in UTF-8.
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * An array of information that lists the Dataset objects, which specifies the dataset type and
     * details on its location and schema.
     *
     * You must provide a role that has read access to these tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-trainingdata)
     */
    override fun trainingData(): Any = unwrap(this).getTrainingData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrainingDatasetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cleanroomsml.CfnTrainingDatasetProps):
        CfnTrainingDatasetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTrainingDatasetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrainingDatasetProps):
        software.amazon.awscdk.services.cleanroomsml.CfnTrainingDatasetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cleanroomsml.CfnTrainingDatasetProps
  }
}
