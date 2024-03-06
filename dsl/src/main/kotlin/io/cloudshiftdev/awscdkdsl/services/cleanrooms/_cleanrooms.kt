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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate
import software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps
import software.amazon.awscdk.services.cleanrooms.CfnCollaboration
import software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps
import software.amazon.awscdk.services.cleanrooms.CfnMembership
import software.amazon.awscdk.services.cleanrooms.CfnMembershipProps
import software.constructs.Construct

public object cleanrooms {
    /**
     * Creates a new analysis template.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * CfnAnalysisTemplate cfnAnalysisTemplate = CfnAnalysisTemplate.Builder.create(this,
     * "MyCfnAnalysisTemplate")
     * .format("format")
     * .membershipIdentifier("membershipIdentifier")
     * .name("name")
     * .source(AnalysisSourceProperty.builder()
     * .text("text")
     * .build())
     * // the properties below are optional
     * .analysisParameters(List.of(AnalysisParameterProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .defaultValue("defaultValue")
     * .build()))
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html)
     */
    public inline fun cfnAnalysisTemplate(
        scope: Construct,
        id: String,
        block: CfnAnalysisTemplateDsl.() -> Unit = {},
    ): CfnAnalysisTemplate {
        val builder = CfnAnalysisTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Optional.
     *
     * The member who can query can provide this placeholder for a literal data value in an analysis
     * template.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * AnalysisParameterProperty analysisParameterProperty = AnalysisParameterProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .defaultValue("defaultValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysisparameter.html)
     */
    public inline fun cfnAnalysisTemplateAnalysisParameterProperty(
        block: CfnAnalysisTemplateAnalysisParameterPropertyDsl.() -> Unit = {}
    ): CfnAnalysisTemplate.AnalysisParameterProperty {
        val builder = CfnAnalysisTemplateAnalysisParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A relation within an analysis.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * AnalysisSchemaProperty analysisSchemaProperty = AnalysisSchemaProperty.builder()
     * .referencedTables(List.of("referencedTables"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysisschema.html)
     */
    public inline fun cfnAnalysisTemplateAnalysisSchemaProperty(
        block: CfnAnalysisTemplateAnalysisSchemaPropertyDsl.() -> Unit = {}
    ): CfnAnalysisTemplate.AnalysisSchemaProperty {
        val builder = CfnAnalysisTemplateAnalysisSchemaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The structure that defines the body of the analysis template.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * AnalysisSourceProperty analysisSourceProperty = AnalysisSourceProperty.builder()
     * .text("text")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysissource.html)
     */
    public inline fun cfnAnalysisTemplateAnalysisSourceProperty(
        block: CfnAnalysisTemplateAnalysisSourcePropertyDsl.() -> Unit = {}
    ): CfnAnalysisTemplate.AnalysisSourceProperty {
        val builder = CfnAnalysisTemplateAnalysisSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAnalysisTemplate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * CfnAnalysisTemplateProps cfnAnalysisTemplateProps = CfnAnalysisTemplateProps.builder()
     * .format("format")
     * .membershipIdentifier("membershipIdentifier")
     * .name("name")
     * .source(AnalysisSourceProperty.builder()
     * .text("text")
     * .build())
     * // the properties below are optional
     * .analysisParameters(List.of(AnalysisParameterProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .defaultValue("defaultValue")
     * .build()))
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html)
     */
    public inline fun cfnAnalysisTemplateProps(
        block: CfnAnalysisTemplatePropsDsl.() -> Unit = {}
    ): CfnAnalysisTemplateProps {
        val builder = CfnAnalysisTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new collaboration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * CfnCollaboration cfnCollaboration = CfnCollaboration.Builder.create(this, "MyCfnCollaboration")
     * .creatorDisplayName("creatorDisplayName")
     * .creatorMemberAbilities(List.of("creatorMemberAbilities"))
     * .description("description")
     * .members(List.of(MemberSpecificationProperty.builder()
     * .accountId("accountId")
     * .displayName("displayName")
     * .memberAbilities(List.of("memberAbilities"))
     * // the properties below are optional
     * .paymentConfiguration(PaymentConfigurationProperty.builder()
     * .queryCompute(QueryComputePaymentConfigProperty.builder()
     * .isResponsible(false)
     * .build())
     * .build())
     * .build()))
     * .name("name")
     * .queryLogStatus("queryLogStatus")
     * // the properties below are optional
     * .creatorPaymentConfiguration(PaymentConfigurationProperty.builder()
     * .queryCompute(QueryComputePaymentConfigProperty.builder()
     * .isResponsible(false)
     * .build())
     * .build())
     * .dataEncryptionMetadata(DataEncryptionMetadataProperty.builder()
     * .allowCleartext(false)
     * .allowDuplicates(false)
     * .allowJoinsOnColumnsWithDifferentNames(false)
     * .preserveNulls(false)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html)
     */
    public inline fun cfnCollaboration(
        scope: Construct,
        id: String,
        block: CfnCollaborationDsl.() -> Unit = {},
    ): CfnCollaboration {
        val builder = CfnCollaborationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for client-side encryption for cryptographic computing.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * DataEncryptionMetadataProperty dataEncryptionMetadataProperty =
     * DataEncryptionMetadataProperty.builder()
     * .allowCleartext(false)
     * .allowDuplicates(false)
     * .allowJoinsOnColumnsWithDifferentNames(false)
     * .preserveNulls(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-dataencryptionmetadata.html)
     */
    public inline fun cfnCollaborationDataEncryptionMetadataProperty(
        block: CfnCollaborationDataEncryptionMetadataPropertyDsl.() -> Unit = {}
    ): CfnCollaboration.DataEncryptionMetadataProperty {
        val builder = CfnCollaborationDataEncryptionMetadataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Basic metadata used to construct a new member.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * MemberSpecificationProperty memberSpecificationProperty = MemberSpecificationProperty.builder()
     * .accountId("accountId")
     * .displayName("displayName")
     * .memberAbilities(List.of("memberAbilities"))
     * // the properties below are optional
     * .paymentConfiguration(PaymentConfigurationProperty.builder()
     * .queryCompute(QueryComputePaymentConfigProperty.builder()
     * .isResponsible(false)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-memberspecification.html)
     */
    public inline fun cfnCollaborationMemberSpecificationProperty(
        block: CfnCollaborationMemberSpecificationPropertyDsl.() -> Unit = {}
    ): CfnCollaboration.MemberSpecificationProperty {
        val builder = CfnCollaborationMemberSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing the collaboration member's payment responsibilities set by the
     * collaboration creator.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * PaymentConfigurationProperty paymentConfigurationProperty =
     * PaymentConfigurationProperty.builder()
     * .queryCompute(QueryComputePaymentConfigProperty.builder()
     * .isResponsible(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-paymentconfiguration.html)
     */
    public inline fun cfnCollaborationPaymentConfigurationProperty(
        block: CfnCollaborationPaymentConfigurationPropertyDsl.() -> Unit = {}
    ): CfnCollaboration.PaymentConfigurationProperty {
        val builder = CfnCollaborationPaymentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCollaboration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * CfnCollaborationProps cfnCollaborationProps = CfnCollaborationProps.builder()
     * .creatorDisplayName("creatorDisplayName")
     * .creatorMemberAbilities(List.of("creatorMemberAbilities"))
     * .description("description")
     * .members(List.of(MemberSpecificationProperty.builder()
     * .accountId("accountId")
     * .displayName("displayName")
     * .memberAbilities(List.of("memberAbilities"))
     * // the properties below are optional
     * .paymentConfiguration(PaymentConfigurationProperty.builder()
     * .queryCompute(QueryComputePaymentConfigProperty.builder()
     * .isResponsible(false)
     * .build())
     * .build())
     * .build()))
     * .name("name")
     * .queryLogStatus("queryLogStatus")
     * // the properties below are optional
     * .creatorPaymentConfiguration(PaymentConfigurationProperty.builder()
     * .queryCompute(QueryComputePaymentConfigProperty.builder()
     * .isResponsible(false)
     * .build())
     * .build())
     * .dataEncryptionMetadata(DataEncryptionMetadataProperty.builder()
     * .allowCleartext(false)
     * .allowDuplicates(false)
     * .allowJoinsOnColumnsWithDifferentNames(false)
     * .preserveNulls(false)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html)
     */
    public inline fun cfnCollaborationProps(
        block: CfnCollaborationPropsDsl.() -> Unit = {}
    ): CfnCollaborationProps {
        val builder = CfnCollaborationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing the collaboration member's payment responsibilities set by the
     * collaboration creator for query compute costs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * QueryComputePaymentConfigProperty queryComputePaymentConfigProperty =
     * QueryComputePaymentConfigProperty.builder()
     * .isResponsible(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-querycomputepaymentconfig.html)
     */
    public inline fun cfnCollaborationQueryComputePaymentConfigProperty(
        block: CfnCollaborationQueryComputePaymentConfigPropertyDsl.() -> Unit = {}
    ): CfnCollaboration.QueryComputePaymentConfigProperty {
        val builder = CfnCollaborationQueryComputePaymentConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new configured table resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * CfnConfiguredTable cfnConfiguredTable = CfnConfiguredTable.Builder.create(this,
     * "MyCfnConfiguredTable")
     * .allowedColumns(List.of("allowedColumns"))
     * .analysisMethod("analysisMethod")
     * .name("name")
     * .tableReference(TableReferenceProperty.builder()
     * .glue(GlueTableReferenceProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .build())
     * .build())
     * // the properties below are optional
     * .analysisRules(List.of(AnalysisRuleProperty.builder()
     * .policy(ConfiguredTableAnalysisRulePolicyProperty.builder()
     * .v1(ConfiguredTableAnalysisRulePolicyV1Property.builder()
     * .aggregation(AnalysisRuleAggregationProperty.builder()
     * .aggregateColumns(List.of(AggregateColumnProperty.builder()
     * .columnNames(List.of("columnNames"))
     * .function("function")
     * .build()))
     * .dimensionColumns(List.of("dimensionColumns"))
     * .joinColumns(List.of("joinColumns"))
     * .outputConstraints(List.of(AggregationConstraintProperty.builder()
     * .columnName("columnName")
     * .minimum(123)
     * .type("type")
     * .build()))
     * .scalarFunctions(List.of("scalarFunctions"))
     * // the properties below are optional
     * .allowedJoinOperators(List.of("allowedJoinOperators"))
     * .joinRequired("joinRequired")
     * .build())
     * .custom(AnalysisRuleCustomProperty.builder()
     * .allowedAnalyses(List.of("allowedAnalyses"))
     * // the properties below are optional
     * .allowedAnalysisProviders(List.of("allowedAnalysisProviders"))
     * .build())
     * .list(AnalysisRuleListProperty.builder()
     * .joinColumns(List.of("joinColumns"))
     * .listColumns(List.of("listColumns"))
     * // the properties below are optional
     * .allowedJoinOperators(List.of("allowedJoinOperators"))
     * .build())
     * .build())
     * .build())
     * .type("type")
     * .build()))
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html)
     */
    public inline fun cfnConfiguredTable(
        scope: Construct,
        id: String,
        block: CfnConfiguredTableDsl.() -> Unit = {},
    ): CfnConfiguredTable {
        val builder = CfnConfiguredTableDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Column in configured table that can be used in aggregate function in query.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * AggregateColumnProperty aggregateColumnProperty = AggregateColumnProperty.builder()
     * .columnNames(List.of("columnNames"))
     * .function("function")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-aggregatecolumn.html)
     */
    public inline fun cfnConfiguredTableAggregateColumnProperty(
        block: CfnConfiguredTableAggregateColumnPropertyDsl.() -> Unit = {}
    ): CfnConfiguredTable.AggregateColumnProperty {
        val builder = CfnConfiguredTableAggregateColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Constraint on query output removing output rows that do not meet a minimum number of distinct
     * values of a specified column.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * AggregationConstraintProperty aggregationConstraintProperty =
     * AggregationConstraintProperty.builder()
     * .columnName("columnName")
     * .minimum(123)
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-aggregationconstraint.html)
     */
    public inline fun cfnConfiguredTableAggregationConstraintProperty(
        block: CfnConfiguredTableAggregationConstraintPropertyDsl.() -> Unit = {}
    ): CfnConfiguredTable.AggregationConstraintProperty {
        val builder = CfnConfiguredTableAggregationConstraintPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A type of analysis rule that enables query structure and specified queries that produce
     * aggregate statistics.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * AnalysisRuleAggregationProperty analysisRuleAggregationProperty =
     * AnalysisRuleAggregationProperty.builder()
     * .aggregateColumns(List.of(AggregateColumnProperty.builder()
     * .columnNames(List.of("columnNames"))
     * .function("function")
     * .build()))
     * .dimensionColumns(List.of("dimensionColumns"))
     * .joinColumns(List.of("joinColumns"))
     * .outputConstraints(List.of(AggregationConstraintProperty.builder()
     * .columnName("columnName")
     * .minimum(123)
     * .type("type")
     * .build()))
     * .scalarFunctions(List.of("scalarFunctions"))
     * // the properties below are optional
     * .allowedJoinOperators(List.of("allowedJoinOperators"))
     * .joinRequired("joinRequired")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisruleaggregation.html)
     */
    public inline fun cfnConfiguredTableAnalysisRuleAggregationProperty(
        block: CfnConfiguredTableAnalysisRuleAggregationPropertyDsl.() -> Unit = {}
    ): CfnConfiguredTable.AnalysisRuleAggregationProperty {
        val builder = CfnConfiguredTableAnalysisRuleAggregationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A type of analysis rule that enables the table owner to approve custom SQL queries on their
     * configured tables.
     *
     * It supports differential privacy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * AnalysisRuleCustomProperty analysisRuleCustomProperty = AnalysisRuleCustomProperty.builder()
     * .allowedAnalyses(List.of("allowedAnalyses"))
     * // the properties below are optional
     * .allowedAnalysisProviders(List.of("allowedAnalysisProviders"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrulecustom.html)
     */
    public inline fun cfnConfiguredTableAnalysisRuleCustomProperty(
        block: CfnConfiguredTableAnalysisRuleCustomPropertyDsl.() -> Unit = {}
    ): CfnConfiguredTable.AnalysisRuleCustomProperty {
        val builder = CfnConfiguredTableAnalysisRuleCustomPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A type of analysis rule that enables row-level analysis.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * AnalysisRuleListProperty analysisRuleListProperty = AnalysisRuleListProperty.builder()
     * .joinColumns(List.of("joinColumns"))
     * .listColumns(List.of("listColumns"))
     * // the properties below are optional
     * .allowedJoinOperators(List.of("allowedJoinOperators"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrulelist.html)
     */
    public inline fun cfnConfiguredTableAnalysisRuleListProperty(
        block: CfnConfiguredTableAnalysisRuleListPropertyDsl.() -> Unit = {}
    ): CfnConfiguredTable.AnalysisRuleListProperty {
        val builder = CfnConfiguredTableAnalysisRuleListPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A specification about how data from the configured table can be used in a query.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * AnalysisRuleProperty analysisRuleProperty = AnalysisRuleProperty.builder()
     * .policy(ConfiguredTableAnalysisRulePolicyProperty.builder()
     * .v1(ConfiguredTableAnalysisRulePolicyV1Property.builder()
     * .aggregation(AnalysisRuleAggregationProperty.builder()
     * .aggregateColumns(List.of(AggregateColumnProperty.builder()
     * .columnNames(List.of("columnNames"))
     * .function("function")
     * .build()))
     * .dimensionColumns(List.of("dimensionColumns"))
     * .joinColumns(List.of("joinColumns"))
     * .outputConstraints(List.of(AggregationConstraintProperty.builder()
     * .columnName("columnName")
     * .minimum(123)
     * .type("type")
     * .build()))
     * .scalarFunctions(List.of("scalarFunctions"))
     * // the properties below are optional
     * .allowedJoinOperators(List.of("allowedJoinOperators"))
     * .joinRequired("joinRequired")
     * .build())
     * .custom(AnalysisRuleCustomProperty.builder()
     * .allowedAnalyses(List.of("allowedAnalyses"))
     * // the properties below are optional
     * .allowedAnalysisProviders(List.of("allowedAnalysisProviders"))
     * .build())
     * .list(AnalysisRuleListProperty.builder()
     * .joinColumns(List.of("joinColumns"))
     * .listColumns(List.of("listColumns"))
     * // the properties below are optional
     * .allowedJoinOperators(List.of("allowedJoinOperators"))
     * .build())
     * .build())
     * .build())
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrule.html)
     */
    public inline fun cfnConfiguredTableAnalysisRuleProperty(
        block: CfnConfiguredTableAnalysisRulePropertyDsl.() -> Unit = {}
    ): CfnConfiguredTable.AnalysisRuleProperty {
        val builder = CfnConfiguredTableAnalysisRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a configured table association.
     *
     * A configured table association links a configured table with a collaboration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * CfnConfiguredTableAssociation cfnConfiguredTableAssociation =
     * CfnConfiguredTableAssociation.Builder.create(this, "MyCfnConfiguredTableAssociation")
     * .configuredTableIdentifier("configuredTableIdentifier")
     * .membershipIdentifier("membershipIdentifier")
     * .name("name")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html)
     */
    public inline fun cfnConfiguredTableAssociation(
        scope: Construct,
        id: String,
        block: CfnConfiguredTableAssociationDsl.() -> Unit = {},
    ): CfnConfiguredTableAssociation {
        val builder = CfnConfiguredTableAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConfiguredTableAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * CfnConfiguredTableAssociationProps cfnConfiguredTableAssociationProps =
     * CfnConfiguredTableAssociationProps.builder()
     * .configuredTableIdentifier("configuredTableIdentifier")
     * .membershipIdentifier("membershipIdentifier")
     * .name("name")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html)
     */
    public inline fun cfnConfiguredTableAssociationProps(
        block: CfnConfiguredTableAssociationPropsDsl.() -> Unit = {}
    ): CfnConfiguredTableAssociationProps {
        val builder = CfnConfiguredTableAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Controls on the query specifications that can be run on a configured table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * ConfiguredTableAnalysisRulePolicyProperty configuredTableAnalysisRulePolicyProperty =
     * ConfiguredTableAnalysisRulePolicyProperty.builder()
     * .v1(ConfiguredTableAnalysisRulePolicyV1Property.builder()
     * .aggregation(AnalysisRuleAggregationProperty.builder()
     * .aggregateColumns(List.of(AggregateColumnProperty.builder()
     * .columnNames(List.of("columnNames"))
     * .function("function")
     * .build()))
     * .dimensionColumns(List.of("dimensionColumns"))
     * .joinColumns(List.of("joinColumns"))
     * .outputConstraints(List.of(AggregationConstraintProperty.builder()
     * .columnName("columnName")
     * .minimum(123)
     * .type("type")
     * .build()))
     * .scalarFunctions(List.of("scalarFunctions"))
     * // the properties below are optional
     * .allowedJoinOperators(List.of("allowedJoinOperators"))
     * .joinRequired("joinRequired")
     * .build())
     * .custom(AnalysisRuleCustomProperty.builder()
     * .allowedAnalyses(List.of("allowedAnalyses"))
     * // the properties below are optional
     * .allowedAnalysisProviders(List.of("allowedAnalysisProviders"))
     * .build())
     * .list(AnalysisRuleListProperty.builder()
     * .joinColumns(List.of("joinColumns"))
     * .listColumns(List.of("listColumns"))
     * // the properties below are optional
     * .allowedJoinOperators(List.of("allowedJoinOperators"))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-configuredtableanalysisrulepolicy.html)
     */
    public inline fun cfnConfiguredTableConfiguredTableAnalysisRulePolicyProperty(
        block: CfnConfiguredTableConfiguredTableAnalysisRulePolicyPropertyDsl.() -> Unit = {}
    ): CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyProperty {
        val builder = CfnConfiguredTableConfiguredTableAnalysisRulePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Controls on the query specifications that can be run on a configured table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * ConfiguredTableAnalysisRulePolicyV1Property configuredTableAnalysisRulePolicyV1Property =
     * ConfiguredTableAnalysisRulePolicyV1Property.builder()
     * .aggregation(AnalysisRuleAggregationProperty.builder()
     * .aggregateColumns(List.of(AggregateColumnProperty.builder()
     * .columnNames(List.of("columnNames"))
     * .function("function")
     * .build()))
     * .dimensionColumns(List.of("dimensionColumns"))
     * .joinColumns(List.of("joinColumns"))
     * .outputConstraints(List.of(AggregationConstraintProperty.builder()
     * .columnName("columnName")
     * .minimum(123)
     * .type("type")
     * .build()))
     * .scalarFunctions(List.of("scalarFunctions"))
     * // the properties below are optional
     * .allowedJoinOperators(List.of("allowedJoinOperators"))
     * .joinRequired("joinRequired")
     * .build())
     * .custom(AnalysisRuleCustomProperty.builder()
     * .allowedAnalyses(List.of("allowedAnalyses"))
     * // the properties below are optional
     * .allowedAnalysisProviders(List.of("allowedAnalysisProviders"))
     * .build())
     * .list(AnalysisRuleListProperty.builder()
     * .joinColumns(List.of("joinColumns"))
     * .listColumns(List.of("listColumns"))
     * // the properties below are optional
     * .allowedJoinOperators(List.of("allowedJoinOperators"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-configuredtableanalysisrulepolicyv1.html)
     */
    public inline fun cfnConfiguredTableConfiguredTableAnalysisRulePolicyV1Property(
        block: CfnConfiguredTableConfiguredTableAnalysisRulePolicyV1PropertyDsl.() -> Unit = {}
    ): CfnConfiguredTable.ConfiguredTableAnalysisRulePolicyV1Property {
        val builder = CfnConfiguredTableConfiguredTableAnalysisRulePolicyV1PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A reference to a table within an AWS Glue data catalog.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * GlueTableReferenceProperty glueTableReferenceProperty = GlueTableReferenceProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-gluetablereference.html)
     */
    public inline fun cfnConfiguredTableGlueTableReferenceProperty(
        block: CfnConfiguredTableGlueTableReferencePropertyDsl.() -> Unit = {}
    ): CfnConfiguredTable.GlueTableReferenceProperty {
        val builder = CfnConfiguredTableGlueTableReferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConfiguredTable`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * CfnConfiguredTableProps cfnConfiguredTableProps = CfnConfiguredTableProps.builder()
     * .allowedColumns(List.of("allowedColumns"))
     * .analysisMethod("analysisMethod")
     * .name("name")
     * .tableReference(TableReferenceProperty.builder()
     * .glue(GlueTableReferenceProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .build())
     * .build())
     * // the properties below are optional
     * .analysisRules(List.of(AnalysisRuleProperty.builder()
     * .policy(ConfiguredTableAnalysisRulePolicyProperty.builder()
     * .v1(ConfiguredTableAnalysisRulePolicyV1Property.builder()
     * .aggregation(AnalysisRuleAggregationProperty.builder()
     * .aggregateColumns(List.of(AggregateColumnProperty.builder()
     * .columnNames(List.of("columnNames"))
     * .function("function")
     * .build()))
     * .dimensionColumns(List.of("dimensionColumns"))
     * .joinColumns(List.of("joinColumns"))
     * .outputConstraints(List.of(AggregationConstraintProperty.builder()
     * .columnName("columnName")
     * .minimum(123)
     * .type("type")
     * .build()))
     * .scalarFunctions(List.of("scalarFunctions"))
     * // the properties below are optional
     * .allowedJoinOperators(List.of("allowedJoinOperators"))
     * .joinRequired("joinRequired")
     * .build())
     * .custom(AnalysisRuleCustomProperty.builder()
     * .allowedAnalyses(List.of("allowedAnalyses"))
     * // the properties below are optional
     * .allowedAnalysisProviders(List.of("allowedAnalysisProviders"))
     * .build())
     * .list(AnalysisRuleListProperty.builder()
     * .joinColumns(List.of("joinColumns"))
     * .listColumns(List.of("listColumns"))
     * // the properties below are optional
     * .allowedJoinOperators(List.of("allowedJoinOperators"))
     * .build())
     * .build())
     * .build())
     * .type("type")
     * .build()))
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtable.html)
     */
    public inline fun cfnConfiguredTableProps(
        block: CfnConfiguredTablePropsDsl.() -> Unit = {}
    ): CfnConfiguredTableProps {
        val builder = CfnConfiguredTablePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A pointer to the dataset that underlies this table.
     *
     * Currently, this can only be an AWS Glue table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * TableReferenceProperty tableReferenceProperty = TableReferenceProperty.builder()
     * .glue(GlueTableReferenceProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-tablereference.html)
     */
    public inline fun cfnConfiguredTableTableReferenceProperty(
        block: CfnConfiguredTableTableReferencePropertyDsl.() -> Unit = {}
    ): CfnConfiguredTable.TableReferenceProperty {
        val builder = CfnConfiguredTableTableReferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a membership for a specific collaboration identifier and joins the collaboration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * CfnMembership cfnMembership = CfnMembership.Builder.create(this, "MyCfnMembership")
     * .collaborationIdentifier("collaborationIdentifier")
     * .queryLogStatus("queryLogStatus")
     * // the properties below are optional
     * .defaultResultConfiguration(MembershipProtectedQueryResultConfigurationProperty.builder()
     * .outputConfiguration(MembershipProtectedQueryOutputConfigurationProperty.builder()
     * .s3(ProtectedQueryS3OutputConfigurationProperty.builder()
     * .bucket("bucket")
     * .resultFormat("resultFormat")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build())
     * .build())
     * // the properties below are optional
     * .roleArn("roleArn")
     * .build())
     * .paymentConfiguration(MembershipPaymentConfigurationProperty.builder()
     * .queryCompute(MembershipQueryComputePaymentConfigProperty.builder()
     * .isResponsible(false)
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html)
     */
    public inline fun cfnMembership(
        scope: Construct,
        id: String,
        block: CfnMembershipDsl.() -> Unit = {},
    ): CfnMembership {
        val builder = CfnMembershipDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing the payment responsibilities accepted by the collaboration member.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * MembershipPaymentConfigurationProperty membershipPaymentConfigurationProperty =
     * MembershipPaymentConfigurationProperty.builder()
     * .queryCompute(MembershipQueryComputePaymentConfigProperty.builder()
     * .isResponsible(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershippaymentconfiguration.html)
     */
    public inline fun cfnMembershipMembershipPaymentConfigurationProperty(
        block: CfnMembershipMembershipPaymentConfigurationPropertyDsl.() -> Unit = {}
    ): CfnMembership.MembershipPaymentConfigurationProperty {
        val builder = CfnMembershipMembershipPaymentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains configurations for protected query results.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * MembershipProtectedQueryOutputConfigurationProperty
     * membershipProtectedQueryOutputConfigurationProperty =
     * MembershipProtectedQueryOutputConfigurationProperty.builder()
     * .s3(ProtectedQueryS3OutputConfigurationProperty.builder()
     * .bucket("bucket")
     * .resultFormat("resultFormat")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedqueryoutputconfiguration.html)
     */
    public inline fun cfnMembershipMembershipProtectedQueryOutputConfigurationProperty(
        block: CfnMembershipMembershipProtectedQueryOutputConfigurationPropertyDsl.() -> Unit = {}
    ): CfnMembership.MembershipProtectedQueryOutputConfigurationProperty {
        val builder = CfnMembershipMembershipProtectedQueryOutputConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains configurations for protected query results.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * MembershipProtectedQueryResultConfigurationProperty
     * membershipProtectedQueryResultConfigurationProperty =
     * MembershipProtectedQueryResultConfigurationProperty.builder()
     * .outputConfiguration(MembershipProtectedQueryOutputConfigurationProperty.builder()
     * .s3(ProtectedQueryS3OutputConfigurationProperty.builder()
     * .bucket("bucket")
     * .resultFormat("resultFormat")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build())
     * .build())
     * // the properties below are optional
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedqueryresultconfiguration.html)
     */
    public inline fun cfnMembershipMembershipProtectedQueryResultConfigurationProperty(
        block: CfnMembershipMembershipProtectedQueryResultConfigurationPropertyDsl.() -> Unit = {}
    ): CfnMembership.MembershipProtectedQueryResultConfigurationProperty {
        val builder = CfnMembershipMembershipProtectedQueryResultConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing the payment responsibilities accepted by the collaboration member for
     * query compute costs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * MembershipQueryComputePaymentConfigProperty membershipQueryComputePaymentConfigProperty =
     * MembershipQueryComputePaymentConfigProperty.builder()
     * .isResponsible(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipquerycomputepaymentconfig.html)
     */
    public inline fun cfnMembershipMembershipQueryComputePaymentConfigProperty(
        block: CfnMembershipMembershipQueryComputePaymentConfigPropertyDsl.() -> Unit = {}
    ): CfnMembership.MembershipQueryComputePaymentConfigProperty {
        val builder = CfnMembershipMembershipQueryComputePaymentConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMembership`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * CfnMembershipProps cfnMembershipProps = CfnMembershipProps.builder()
     * .collaborationIdentifier("collaborationIdentifier")
     * .queryLogStatus("queryLogStatus")
     * // the properties below are optional
     * .defaultResultConfiguration(MembershipProtectedQueryResultConfigurationProperty.builder()
     * .outputConfiguration(MembershipProtectedQueryOutputConfigurationProperty.builder()
     * .s3(ProtectedQueryS3OutputConfigurationProperty.builder()
     * .bucket("bucket")
     * .resultFormat("resultFormat")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build())
     * .build())
     * // the properties below are optional
     * .roleArn("roleArn")
     * .build())
     * .paymentConfiguration(MembershipPaymentConfigurationProperty.builder()
     * .queryCompute(MembershipQueryComputePaymentConfigProperty.builder()
     * .isResponsible(false)
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html)
     */
    public inline fun cfnMembershipProps(
        block: CfnMembershipPropsDsl.() -> Unit = {}
    ): CfnMembershipProps {
        val builder = CfnMembershipPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the configuration to write the query results to S3.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cleanrooms.*;
     * ProtectedQueryS3OutputConfigurationProperty protectedQueryS3OutputConfigurationProperty =
     * ProtectedQueryS3OutputConfigurationProperty.builder()
     * .bucket("bucket")
     * .resultFormat("resultFormat")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedquerys3outputconfiguration.html)
     */
    public inline fun cfnMembershipProtectedQueryS3OutputConfigurationProperty(
        block: CfnMembershipProtectedQueryS3OutputConfigurationPropertyDsl.() -> Unit = {}
    ): CfnMembership.ProtectedQueryS3OutputConfigurationProperty {
        val builder = CfnMembershipProtectedQueryS3OutputConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
