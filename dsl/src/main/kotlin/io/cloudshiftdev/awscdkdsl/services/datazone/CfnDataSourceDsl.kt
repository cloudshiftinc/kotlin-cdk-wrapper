@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.datazone

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datazone.CfnDataSource
import software.constructs.Construct

/**
 * The `AWS::DataZone::DataSource` resource specifies an Amazon DataZone data source that is used to
 * import technical metadata of assets (data) from the source databases or data warehouses into
 * Amazon DataZone.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * CfnDataSource cfnDataSource = CfnDataSource.Builder.create(this, "MyCfnDataSource")
 * .domainIdentifier("domainIdentifier")
 * .environmentIdentifier("environmentIdentifier")
 * .name("name")
 * .projectIdentifier("projectIdentifier")
 * .type("type")
 * // the properties below are optional
 * .assetFormsInput(List.of(FormInputProperty.builder()
 * .formName("formName")
 * // the properties below are optional
 * .content("content")
 * .typeIdentifier("typeIdentifier")
 * .typeRevision("typeRevision")
 * .build()))
 * .configuration(DataSourceConfigurationInputProperty.builder()
 * .glueRunConfiguration(GlueRunConfigurationInputProperty.builder()
 * .relationalFilterConfigurations(List.of(RelationalFilterConfigurationProperty.builder()
 * .databaseName("databaseName")
 * // the properties below are optional
 * .filterExpressions(List.of(FilterExpressionProperty.builder()
 * .expression("expression")
 * .type("type")
 * .build()))
 * .schemaName("schemaName")
 * .build()))
 * // the properties below are optional
 * .dataAccessRole("dataAccessRole")
 * .build())
 * .redshiftRunConfiguration(RedshiftRunConfigurationInputProperty.builder()
 * .redshiftCredentialConfiguration(RedshiftCredentialConfigurationProperty.builder()
 * .secretManagerArn("secretManagerArn")
 * .build())
 * .redshiftStorage(RedshiftStorageProperty.builder()
 * .redshiftClusterSource(RedshiftClusterStorageProperty.builder()
 * .clusterName("clusterName")
 * .build())
 * .redshiftServerlessSource(RedshiftServerlessStorageProperty.builder()
 * .workgroupName("workgroupName")
 * .build())
 * .build())
 * .relationalFilterConfigurations(List.of(RelationalFilterConfigurationProperty.builder()
 * .databaseName("databaseName")
 * // the properties below are optional
 * .filterExpressions(List.of(FilterExpressionProperty.builder()
 * .expression("expression")
 * .type("type")
 * .build()))
 * .schemaName("schemaName")
 * .build()))
 * // the properties below are optional
 * .dataAccessRole("dataAccessRole")
 * .build())
 * .build())
 * .description("description")
 * .enableSetting("enableSetting")
 * .publishOnImport(false)
 * .recommendation(RecommendationConfigurationProperty.builder()
 * .enableBusinessNameGeneration(false)
 * .build())
 * .schedule(ScheduleConfigurationProperty.builder()
 * .schedule("schedule")
 * .timezone("timezone")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html)
 */
@CdkDslMarker
public class CfnDataSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDataSource.Builder = CfnDataSource.Builder.create(scope, id)

    private val _assetFormsInput: MutableList<Any> = mutableListOf()

    /**
     * The metadata forms attached to the assets that the data source works with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-assetformsinput)
     *
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     *   with.
     */
    public fun assetFormsInput(vararg assetFormsInput: Any) {
        _assetFormsInput.addAll(listOf(*assetFormsInput))
    }

    /**
     * The metadata forms attached to the assets that the data source works with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-assetformsinput)
     *
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     *   with.
     */
    public fun assetFormsInput(assetFormsInput: Collection<Any>) {
        _assetFormsInput.addAll(assetFormsInput)
    }

    /**
     * The metadata forms attached to the assets that the data source works with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-assetformsinput)
     *
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     *   with.
     */
    public fun assetFormsInput(assetFormsInput: IResolvable) {
        cdkBuilder.assetFormsInput(assetFormsInput)
    }

    /**
     * The configuration of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-configuration)
     *
     * @param configuration The configuration of the data source.
     */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * The configuration of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-configuration)
     *
     * @param configuration The configuration of the data source.
     */
    public fun configuration(configuration: CfnDataSource.DataSourceConfigurationInputProperty) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * The description of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-description)
     *
     * @param description The description of the data source.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The ID of the Amazon DataZone domain where the data source is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-domainidentifier)
     *
     * @param domainIdentifier The ID of the Amazon DataZone domain where the data source is
     *   created.
     */
    public fun domainIdentifier(domainIdentifier: String) {
        cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * Specifies whether the data source is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-enablesetting)
     *
     * @param enableSetting Specifies whether the data source is enabled.
     */
    public fun enableSetting(enableSetting: String) {
        cdkBuilder.enableSetting(enableSetting)
    }

    /**
     * The unique identifier of the Amazon DataZone environment to which the data source publishes
     * assets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-environmentidentifier)
     *
     * @param environmentIdentifier The unique identifier of the Amazon DataZone environment to
     *   which the data source publishes assets.
     */
    public fun environmentIdentifier(environmentIdentifier: String) {
        cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * The name of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-name)
     *
     * @param name The name of the data source.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The identifier of the Amazon DataZone project in which you want to add this data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-projectidentifier)
     *
     * @param projectIdentifier The identifier of the Amazon DataZone project in which you want to
     *   add this data source.
     */
    public fun projectIdentifier(projectIdentifier: String) {
        cdkBuilder.projectIdentifier(projectIdentifier)
    }

    /**
     * Specifies whether the assets that this data source creates in the inventory are to be also
     * automatically published to the catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-publishonimport)
     *
     * @param publishOnImport Specifies whether the assets that this data source creates in the
     *   inventory are to be also automatically published to the catalog.
     */
    public fun publishOnImport(publishOnImport: Boolean) {
        cdkBuilder.publishOnImport(publishOnImport)
    }

    /**
     * Specifies whether the assets that this data source creates in the inventory are to be also
     * automatically published to the catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-publishonimport)
     *
     * @param publishOnImport Specifies whether the assets that this data source creates in the
     *   inventory are to be also automatically published to the catalog.
     */
    public fun publishOnImport(publishOnImport: IResolvable) {
        cdkBuilder.publishOnImport(publishOnImport)
    }

    /**
     * Specifies whether the business name generation is to be enabled for this data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-recommendation)
     *
     * @param recommendation Specifies whether the business name generation is to be enabled for
     *   this data source.
     */
    public fun recommendation(recommendation: IResolvable) {
        cdkBuilder.recommendation(recommendation)
    }

    /**
     * Specifies whether the business name generation is to be enabled for this data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-recommendation)
     *
     * @param recommendation Specifies whether the business name generation is to be enabled for
     *   this data source.
     */
    public fun recommendation(recommendation: CfnDataSource.RecommendationConfigurationProperty) {
        cdkBuilder.recommendation(recommendation)
    }

    /**
     * The schedule of the data source runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-schedule)
     *
     * @param schedule The schedule of the data source runs.
     */
    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * The schedule of the data source runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-schedule)
     *
     * @param schedule The schedule of the data source runs.
     */
    public fun schedule(schedule: CfnDataSource.ScheduleConfigurationProperty) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * The type of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-type)
     *
     * @param type The type of the data source.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDataSource {
        if (_assetFormsInput.isNotEmpty()) cdkBuilder.assetFormsInput(_assetFormsInput)
        return cdkBuilder.build()
    }
}
