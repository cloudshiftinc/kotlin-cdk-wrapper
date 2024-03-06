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
import software.amazon.awscdk.services.datazone.CfnDataSourceProps

/**
 * Properties for defining a `CfnDataSource`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * CfnDataSourceProps cfnDataSourceProps = CfnDataSourceProps.builder()
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
public class CfnDataSourcePropsDsl {
    private val cdkBuilder: CfnDataSourceProps.Builder = CfnDataSourceProps.builder()

    private val _assetFormsInput: MutableList<Any> = mutableListOf()

    /**
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     *   with.
     */
    public fun assetFormsInput(vararg assetFormsInput: Any) {
        _assetFormsInput.addAll(listOf(*assetFormsInput))
    }

    /**
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     *   with.
     */
    public fun assetFormsInput(assetFormsInput: Collection<Any>) {
        _assetFormsInput.addAll(assetFormsInput)
    }

    /**
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     *   with.
     */
    public fun assetFormsInput(assetFormsInput: IResolvable) {
        cdkBuilder.assetFormsInput(assetFormsInput)
    }

    /** @param configuration The configuration of the data source. */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /** @param configuration The configuration of the data source. */
    public fun configuration(configuration: CfnDataSource.DataSourceConfigurationInputProperty) {
        cdkBuilder.configuration(configuration)
    }

    /** @param description The description of the data source. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param domainIdentifier The ID of the Amazon DataZone domain where the data source is
     *   created.
     */
    public fun domainIdentifier(domainIdentifier: String) {
        cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /** @param enableSetting Specifies whether the data source is enabled. */
    public fun enableSetting(enableSetting: String) {
        cdkBuilder.enableSetting(enableSetting)
    }

    /**
     * @param environmentIdentifier The unique identifier of the Amazon DataZone environment to
     *   which the data source publishes assets.
     */
    public fun environmentIdentifier(environmentIdentifier: String) {
        cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /** @param name The name of the data source. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param projectIdentifier The identifier of the Amazon DataZone project in which you want to
     *   add this data source.
     */
    public fun projectIdentifier(projectIdentifier: String) {
        cdkBuilder.projectIdentifier(projectIdentifier)
    }

    /**
     * @param publishOnImport Specifies whether the assets that this data source creates in the
     *   inventory are to be also automatically published to the catalog.
     */
    public fun publishOnImport(publishOnImport: Boolean) {
        cdkBuilder.publishOnImport(publishOnImport)
    }

    /**
     * @param publishOnImport Specifies whether the assets that this data source creates in the
     *   inventory are to be also automatically published to the catalog.
     */
    public fun publishOnImport(publishOnImport: IResolvable) {
        cdkBuilder.publishOnImport(publishOnImport)
    }

    /**
     * @param recommendation Specifies whether the business name generation is to be enabled for
     *   this data source.
     */
    public fun recommendation(recommendation: IResolvable) {
        cdkBuilder.recommendation(recommendation)
    }

    /**
     * @param recommendation Specifies whether the business name generation is to be enabled for
     *   this data source.
     */
    public fun recommendation(recommendation: CfnDataSource.RecommendationConfigurationProperty) {
        cdkBuilder.recommendation(recommendation)
    }

    /** @param schedule The schedule of the data source runs. */
    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    /** @param schedule The schedule of the data source runs. */
    public fun schedule(schedule: CfnDataSource.ScheduleConfigurationProperty) {
        cdkBuilder.schedule(schedule)
    }

    /** @param type The type of the data source. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDataSourceProps {
        if (_assetFormsInput.isNotEmpty()) cdkBuilder.assetFormsInput(_assetFormsInput)
        return cdkBuilder.build()
    }
}
