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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datazone.CfnDataSource
import software.amazon.awscdk.services.datazone.CfnDataSourceProps
import software.amazon.awscdk.services.datazone.CfnDomain
import software.amazon.awscdk.services.datazone.CfnDomainProps
import software.amazon.awscdk.services.datazone.CfnEnvironment
import software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration
import software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfigurationProps
import software.amazon.awscdk.services.datazone.CfnEnvironmentProfile
import software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps
import software.amazon.awscdk.services.datazone.CfnEnvironmentProps
import software.amazon.awscdk.services.datazone.CfnProject
import software.amazon.awscdk.services.datazone.CfnProjectProps
import software.amazon.awscdk.services.datazone.CfnSubscriptionTarget
import software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps
import software.constructs.Construct

public object datazone {
    /**
     * The `AWS::DataZone::DataSource` resource specifies an Amazon DataZone data source that is
     * used to import technical metadata of assets (data) from the source databases or data
     * warehouses into Amazon DataZone.
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
    public inline fun cfnDataSource(
        scope: Construct,
        id: String,
        block: CfnDataSourceDsl.() -> Unit = {},
    ): CfnDataSource {
        val builder = CfnDataSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of the data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * DataSourceConfigurationInputProperty dataSourceConfigurationInputProperty =
     * DataSourceConfigurationInputProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-datasourceconfigurationinput.html)
     */
    public inline fun cfnDataSourceDataSourceConfigurationInputProperty(
        block: CfnDataSourceDataSourceConfigurationInputPropertyDsl.() -> Unit = {}
    ): CfnDataSource.DataSourceConfigurationInputProperty {
        val builder = CfnDataSourceDataSourceConfigurationInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A filter expression in Amazon DataZone.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * FilterExpressionProperty filterExpressionProperty = FilterExpressionProperty.builder()
     * .expression("expression")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-filterexpression.html)
     */
    public inline fun cfnDataSourceFilterExpressionProperty(
        block: CfnDataSourceFilterExpressionPropertyDsl.() -> Unit = {}
    ): CfnDataSource.FilterExpressionProperty {
        val builder = CfnDataSourceFilterExpressionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of a metadata form.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * FormInputProperty formInputProperty = FormInputProperty.builder()
     * .formName("formName")
     * // the properties below are optional
     * .content("content")
     * .typeIdentifier("typeIdentifier")
     * .typeRevision("typeRevision")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-forminput.html)
     */
    public inline fun cfnDataSourceFormInputProperty(
        block: CfnDataSourceFormInputPropertyDsl.() -> Unit = {}
    ): CfnDataSource.FormInputProperty {
        val builder = CfnDataSourceFormInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration details of the AWS Glue data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * GlueRunConfigurationInputProperty glueRunConfigurationInputProperty =
     * GlueRunConfigurationInputProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-gluerunconfigurationinput.html)
     */
    public inline fun cfnDataSourceGlueRunConfigurationInputProperty(
        block: CfnDataSourceGlueRunConfigurationInputPropertyDsl.() -> Unit = {}
    ): CfnDataSource.GlueRunConfigurationInputProperty {
        val builder = CfnDataSourceGlueRunConfigurationInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnDataSourceProps(
        block: CfnDataSourcePropsDsl.() -> Unit = {}
    ): CfnDataSourceProps {
        val builder = CfnDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The recommendation configuration for the data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * RecommendationConfigurationProperty recommendationConfigurationProperty =
     * RecommendationConfigurationProperty.builder()
     * .enableBusinessNameGeneration(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-recommendationconfiguration.html)
     */
    public inline fun cfnDataSourceRecommendationConfigurationProperty(
        block: CfnDataSourceRecommendationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.RecommendationConfigurationProperty {
        val builder = CfnDataSourceRecommendationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of the Amazon Redshift cluster storage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * RedshiftClusterStorageProperty redshiftClusterStorageProperty =
     * RedshiftClusterStorageProperty.builder()
     * .clusterName("clusterName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftclusterstorage.html)
     */
    public inline fun cfnDataSourceRedshiftClusterStorageProperty(
        block: CfnDataSourceRedshiftClusterStoragePropertyDsl.() -> Unit = {}
    ): CfnDataSource.RedshiftClusterStorageProperty {
        val builder = CfnDataSourceRedshiftClusterStoragePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of the credentials required to access an Amazon Redshift cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * RedshiftCredentialConfigurationProperty redshiftCredentialConfigurationProperty =
     * RedshiftCredentialConfigurationProperty.builder()
     * .secretManagerArn("secretManagerArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftcredentialconfiguration.html)
     */
    public inline fun cfnDataSourceRedshiftCredentialConfigurationProperty(
        block: CfnDataSourceRedshiftCredentialConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.RedshiftCredentialConfigurationProperty {
        val builder = CfnDataSourceRedshiftCredentialConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The relational filter configurations included in the configuration details of the Amazon
     * Redshift data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * RedshiftRunConfigurationInputProperty redshiftRunConfigurationInputProperty =
     * RedshiftRunConfigurationInputProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftrunconfigurationinput.html)
     */
    public inline fun cfnDataSourceRedshiftRunConfigurationInputProperty(
        block: CfnDataSourceRedshiftRunConfigurationInputPropertyDsl.() -> Unit = {}
    ): CfnDataSource.RedshiftRunConfigurationInputProperty {
        val builder = CfnDataSourceRedshiftRunConfigurationInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of the Amazon Redshift Serverless workgroup storage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * RedshiftServerlessStorageProperty redshiftServerlessStorageProperty =
     * RedshiftServerlessStorageProperty.builder()
     * .workgroupName("workgroupName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftserverlessstorage.html)
     */
    public inline fun cfnDataSourceRedshiftServerlessStorageProperty(
        block: CfnDataSourceRedshiftServerlessStoragePropertyDsl.() -> Unit = {}
    ): CfnDataSource.RedshiftServerlessStorageProperty {
        val builder = CfnDataSourceRedshiftServerlessStoragePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of the Amazon Redshift storage as part of the configuration of an Amazon Redshift
     * data source run.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * RedshiftStorageProperty redshiftStorageProperty = RedshiftStorageProperty.builder()
     * .redshiftClusterSource(RedshiftClusterStorageProperty.builder()
     * .clusterName("clusterName")
     * .build())
     * .redshiftServerlessSource(RedshiftServerlessStorageProperty.builder()
     * .workgroupName("workgroupName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftstorage.html)
     */
    public inline fun cfnDataSourceRedshiftStorageProperty(
        block: CfnDataSourceRedshiftStoragePropertyDsl.() -> Unit = {}
    ): CfnDataSource.RedshiftStorageProperty {
        val builder = CfnDataSourceRedshiftStoragePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The relational filter configuration for the data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * RelationalFilterConfigurationProperty relationalFilterConfigurationProperty =
     * RelationalFilterConfigurationProperty.builder()
     * .databaseName("databaseName")
     * // the properties below are optional
     * .filterExpressions(List.of(FilterExpressionProperty.builder()
     * .expression("expression")
     * .type("type")
     * .build()))
     * .schemaName("schemaName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-relationalfilterconfiguration.html)
     */
    public inline fun cfnDataSourceRelationalFilterConfigurationProperty(
        block: CfnDataSourceRelationalFilterConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.RelationalFilterConfigurationProperty {
        val builder = CfnDataSourceRelationalFilterConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of the schedule of the data source runs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * ScheduleConfigurationProperty scheduleConfigurationProperty =
     * ScheduleConfigurationProperty.builder()
     * .schedule("schedule")
     * .timezone("timezone")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-scheduleconfiguration.html)
     */
    public inline fun cfnDataSourceScheduleConfigurationProperty(
        block: CfnDataSourceScheduleConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ScheduleConfigurationProperty {
        val builder = CfnDataSourceScheduleConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataZone::Domain` resource specifies an Amazon DataZone domain.
     *
     * You can use domains to organize your assets, users, and their projects.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
     * .domainExecutionRole("domainExecutionRole")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .kmsKeyIdentifier("kmsKeyIdentifier")
     * .singleSignOn(SingleSignOnProperty.builder()
     * .type("type")
     * .userAssignment("userAssignment")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html)
     */
    public inline fun cfnDomain(
        scope: Construct,
        id: String,
        block: CfnDomainDsl.() -> Unit = {},
    ): CfnDomain {
        val builder = CfnDomainDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDomain`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
     * .domainExecutionRole("domainExecutionRole")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .kmsKeyIdentifier("kmsKeyIdentifier")
     * .singleSignOn(SingleSignOnProperty.builder()
     * .type("type")
     * .userAssignment("userAssignment")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html)
     */
    public inline fun cfnDomainProps(block: CfnDomainPropsDsl.() -> Unit = {}): CfnDomainProps {
        val builder = CfnDomainPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The single sign-on details in Amazon DataZone.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * SingleSignOnProperty singleSignOnProperty = SingleSignOnProperty.builder()
     * .type("type")
     * .userAssignment("userAssignment")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-domain-singlesignon.html)
     */
    public inline fun cfnDomainSingleSignOnProperty(
        block: CfnDomainSingleSignOnPropertyDsl.() -> Unit = {}
    ): CfnDomain.SingleSignOnProperty {
        val builder = CfnDomainSingleSignOnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataZone::Environment` resource specifies an Amazon DataZone environment, which is
     * a collection of zero or more configured resources with a given set of IAM principals who can
     * operate on those resources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
     * .domainIdentifier("domainIdentifier")
     * .environmentProfileIdentifier("environmentProfileIdentifier")
     * .name("name")
     * .projectIdentifier("projectIdentifier")
     * // the properties below are optional
     * .description("description")
     * .glossaryTerms(List.of("glossaryTerms"))
     * .userParameters(List.of(EnvironmentParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html)
     */
    public inline fun cfnEnvironment(
        scope: Construct,
        id: String,
        block: CfnEnvironmentDsl.() -> Unit = {},
    ): CfnEnvironment {
        val builder = CfnEnvironmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration details of an environment blueprint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * CfnEnvironmentBlueprintConfiguration cfnEnvironmentBlueprintConfiguration =
     * CfnEnvironmentBlueprintConfiguration.Builder.create(this,
     * "MyCfnEnvironmentBlueprintConfiguration")
     * .domainIdentifier("domainIdentifier")
     * .enabledRegions(List.of("enabledRegions"))
     * .environmentBlueprintIdentifier("environmentBlueprintIdentifier")
     * // the properties below are optional
     * .manageAccessRoleArn("manageAccessRoleArn")
     * .provisioningRoleArn("provisioningRoleArn")
     * .regionalParameters(List.of(RegionalParameterProperty.builder()
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .region("region")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html)
     */
    public inline fun cfnEnvironmentBlueprintConfiguration(
        scope: Construct,
        id: String,
        block: CfnEnvironmentBlueprintConfigurationDsl.() -> Unit = {},
    ): CfnEnvironmentBlueprintConfiguration {
        val builder = CfnEnvironmentBlueprintConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEnvironmentBlueprintConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * CfnEnvironmentBlueprintConfigurationProps cfnEnvironmentBlueprintConfigurationProps =
     * CfnEnvironmentBlueprintConfigurationProps.builder()
     * .domainIdentifier("domainIdentifier")
     * .enabledRegions(List.of("enabledRegions"))
     * .environmentBlueprintIdentifier("environmentBlueprintIdentifier")
     * // the properties below are optional
     * .manageAccessRoleArn("manageAccessRoleArn")
     * .provisioningRoleArn("provisioningRoleArn")
     * .regionalParameters(List.of(RegionalParameterProperty.builder()
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .region("region")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html)
     */
    public inline fun cfnEnvironmentBlueprintConfigurationProps(
        block: CfnEnvironmentBlueprintConfigurationPropsDsl.() -> Unit = {}
    ): CfnEnvironmentBlueprintConfigurationProps {
        val builder = CfnEnvironmentBlueprintConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The regional parameters in the environment blueprint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * RegionalParameterProperty regionalParameterProperty = RegionalParameterProperty.builder()
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .region("region")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentblueprintconfiguration-regionalparameter.html)
     */
    public inline fun cfnEnvironmentBlueprintConfigurationRegionalParameterProperty(
        block: CfnEnvironmentBlueprintConfigurationRegionalParameterPropertyDsl.() -> Unit = {}
    ): CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty {
        val builder = CfnEnvironmentBlueprintConfigurationRegionalParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameter details of the environment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * EnvironmentParameterProperty environmentParameterProperty =
     * EnvironmentParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environment-environmentparameter.html)
     */
    public inline fun cfnEnvironmentEnvironmentParameterProperty(
        block: CfnEnvironmentEnvironmentParameterPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.EnvironmentParameterProperty {
        val builder = CfnEnvironmentEnvironmentParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of an environment profile.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * CfnEnvironmentProfile cfnEnvironmentProfile = CfnEnvironmentProfile.Builder.create(this,
     * "MyCfnEnvironmentProfile")
     * .awsAccountId("awsAccountId")
     * .awsAccountRegion("awsAccountRegion")
     * .domainIdentifier("domainIdentifier")
     * .environmentBlueprintIdentifier("environmentBlueprintIdentifier")
     * .name("name")
     * .projectIdentifier("projectIdentifier")
     * // the properties below are optional
     * .description("description")
     * .userParameters(List.of(EnvironmentParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html)
     */
    public inline fun cfnEnvironmentProfile(
        scope: Construct,
        id: String,
        block: CfnEnvironmentProfileDsl.() -> Unit = {},
    ): CfnEnvironmentProfile {
        val builder = CfnEnvironmentProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameter details of an environment profile.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * EnvironmentParameterProperty environmentParameterProperty =
     * EnvironmentParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentprofile-environmentparameter.html)
     */
    public inline fun cfnEnvironmentProfileEnvironmentParameterProperty(
        block: CfnEnvironmentProfileEnvironmentParameterPropertyDsl.() -> Unit = {}
    ): CfnEnvironmentProfile.EnvironmentParameterProperty {
        val builder = CfnEnvironmentProfileEnvironmentParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEnvironmentProfile`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * CfnEnvironmentProfileProps cfnEnvironmentProfileProps = CfnEnvironmentProfileProps.builder()
     * .awsAccountId("awsAccountId")
     * .awsAccountRegion("awsAccountRegion")
     * .domainIdentifier("domainIdentifier")
     * .environmentBlueprintIdentifier("environmentBlueprintIdentifier")
     * .name("name")
     * .projectIdentifier("projectIdentifier")
     * // the properties below are optional
     * .description("description")
     * .userParameters(List.of(EnvironmentParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html)
     */
    public inline fun cfnEnvironmentProfileProps(
        block: CfnEnvironmentProfilePropsDsl.() -> Unit = {}
    ): CfnEnvironmentProfileProps {
        val builder = CfnEnvironmentProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEnvironment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
     * .domainIdentifier("domainIdentifier")
     * .environmentProfileIdentifier("environmentProfileIdentifier")
     * .name("name")
     * .projectIdentifier("projectIdentifier")
     * // the properties below are optional
     * .description("description")
     * .glossaryTerms(List.of("glossaryTerms"))
     * .userParameters(List.of(EnvironmentParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environment.html)
     */
    public inline fun cfnEnvironmentProps(
        block: CfnEnvironmentPropsDsl.() -> Unit = {}
    ): CfnEnvironmentProps {
        val builder = CfnEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataZone::Project` resource specifies an Amazon DataZone project.
     *
     * Projects enable a group of users to collaborate on various business use cases that involve
     * publishing, discovering, subscribing to, and consuming data in the Amazon DataZone catalog.
     * Project members consume assets from the Amazon DataZone catalog and produce new assets using
     * one or more analytical workflows.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
     * .domainIdentifier("domainIdentifier")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .glossaryTerms(List.of("glossaryTerms"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html)
     */
    public inline fun cfnProject(
        scope: Construct,
        id: String,
        block: CfnProjectDsl.() -> Unit = {},
    ): CfnProject {
        val builder = CfnProjectDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProject`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
     * .domainIdentifier("domainIdentifier")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .glossaryTerms(List.of("glossaryTerms"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html)
     */
    public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
        val builder = CfnProjectPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataZone::SubscriptionTarget` resource specifies an Amazon DataZone subscription
     * target.
     *
     * Subscription targets enable you to access the data to which you have subscribed in your
     * projects. A subscription target specifies the location (for example, a database or a schema)
     * and the required permissions (for example, an IAM role) that Amazon DataZone can use to
     * establish a connection with the source data and to create the necessary grants so that
     * members of the Amazon DataZone project can start querying the data to which they have
     * subscribed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * CfnSubscriptionTarget cfnSubscriptionTarget = CfnSubscriptionTarget.Builder.create(this,
     * "MyCfnSubscriptionTarget")
     * .applicableAssetTypes(List.of("applicableAssetTypes"))
     * .authorizedPrincipals(List.of("authorizedPrincipals"))
     * .domainIdentifier("domainIdentifier")
     * .environmentIdentifier("environmentIdentifier")
     * .manageAccessRole("manageAccessRole")
     * .name("name")
     * .subscriptionTargetConfig(List.of(SubscriptionTargetFormProperty.builder()
     * .content("content")
     * .formName("formName")
     * .build()))
     * .type("type")
     * // the properties below are optional
     * .provider("provider")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html)
     */
    public inline fun cfnSubscriptionTarget(
        scope: Construct,
        id: String,
        block: CfnSubscriptionTargetDsl.() -> Unit = {},
    ): CfnSubscriptionTarget {
        val builder = CfnSubscriptionTargetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSubscriptionTarget`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * CfnSubscriptionTargetProps cfnSubscriptionTargetProps = CfnSubscriptionTargetProps.builder()
     * .applicableAssetTypes(List.of("applicableAssetTypes"))
     * .authorizedPrincipals(List.of("authorizedPrincipals"))
     * .domainIdentifier("domainIdentifier")
     * .environmentIdentifier("environmentIdentifier")
     * .manageAccessRole("manageAccessRole")
     * .name("name")
     * .subscriptionTargetConfig(List.of(SubscriptionTargetFormProperty.builder()
     * .content("content")
     * .formName("formName")
     * .build()))
     * .type("type")
     * // the properties below are optional
     * .provider("provider")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-subscriptiontarget.html)
     */
    public inline fun cfnSubscriptionTargetProps(
        block: CfnSubscriptionTargetPropsDsl.() -> Unit = {}
    ): CfnSubscriptionTargetProps {
        val builder = CfnSubscriptionTargetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of the subscription target configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datazone.*;
     * SubscriptionTargetFormProperty subscriptionTargetFormProperty =
     * SubscriptionTargetFormProperty.builder()
     * .content("content")
     * .formName("formName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-subscriptiontarget-subscriptiontargetform.html)
     */
    public inline fun cfnSubscriptionTargetSubscriptionTargetFormProperty(
        block: CfnSubscriptionTargetSubscriptionTargetFormPropertyDsl.() -> Unit = {}
    ): CfnSubscriptionTarget.SubscriptionTargetFormProperty {
        val builder = CfnSubscriptionTargetSubscriptionTargetFormPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
