@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnCapacityReservation
import software.amazon.awscdk.services.athena.CfnCapacityReservationProps
import software.amazon.awscdk.services.athena.CfnDataCatalog
import software.amazon.awscdk.services.athena.CfnDataCatalogProps
import software.amazon.awscdk.services.athena.CfnNamedQuery
import software.amazon.awscdk.services.athena.CfnNamedQueryProps
import software.amazon.awscdk.services.athena.CfnPreparedStatement
import software.amazon.awscdk.services.athena.CfnPreparedStatementProps
import software.amazon.awscdk.services.athena.CfnWorkGroup
import software.amazon.awscdk.services.athena.CfnWorkGroupProps
import software.constructs.Construct

public object athena {
  /**
   * Specifies a capacity reservation with the provided name and number of requested data processing
   * units.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * CfnCapacityReservation cfnCapacityReservation = CfnCapacityReservation.Builder.create(this,
   * "MyCfnCapacityReservation")
   * .name("name")
   * .targetDpus(123)
   * // the properties below are optional
   * .capacityAssignmentConfiguration(CapacityAssignmentConfigurationProperty.builder()
   * .capacityAssignments(List.of(CapacityAssignmentProperty.builder()
   * .workgroupNames(List.of("workgroupNames"))
   * .build()))
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html)
   */
  public inline fun cfnCapacityReservation(
    scope: Construct,
    id: String,
    block: CfnCapacityReservationDsl.() -> Unit = {},
  ): CfnCapacityReservation {
    val builder = CfnCapacityReservationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Assigns Athena workgroups (and hence their queries) to capacity reservations.
   *
   * A capacity reservation can have only one capacity assignment configuration, but the capacity
   * assignment configuration can be made up of multiple individual assignments. Each assignment
   * specifies how Athena queries can consume capacity from the capacity reservation that their
   * workgroup is mapped to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * CapacityAssignmentConfigurationProperty capacityAssignmentConfigurationProperty =
   * CapacityAssignmentConfigurationProperty.builder()
   * .capacityAssignments(List.of(CapacityAssignmentProperty.builder()
   * .workgroupNames(List.of("workgroupNames"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-capacityreservation-capacityassignmentconfiguration.html)
   */
  public inline
      fun cfnCapacityReservationCapacityAssignmentConfigurationProperty(block: CfnCapacityReservationCapacityAssignmentConfigurationPropertyDsl.() -> Unit
      = {}): CfnCapacityReservation.CapacityAssignmentConfigurationProperty {
    val builder = CfnCapacityReservationCapacityAssignmentConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A mapping between one or more workgroups and a capacity reservation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * CapacityAssignmentProperty capacityAssignmentProperty = CapacityAssignmentProperty.builder()
   * .workgroupNames(List.of("workgroupNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-capacityreservation-capacityassignment.html)
   */
  public inline
      fun cfnCapacityReservationCapacityAssignmentProperty(block: CfnCapacityReservationCapacityAssignmentPropertyDsl.() -> Unit
      = {}): CfnCapacityReservation.CapacityAssignmentProperty {
    val builder = CfnCapacityReservationCapacityAssignmentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnCapacityReservation`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * CfnCapacityReservationProps cfnCapacityReservationProps = CfnCapacityReservationProps.builder()
   * .name("name")
   * .targetDpus(123)
   * // the properties below are optional
   * .capacityAssignmentConfiguration(CapacityAssignmentConfigurationProperty.builder()
   * .capacityAssignments(List.of(CapacityAssignmentProperty.builder()
   * .workgroupNames(List.of("workgroupNames"))
   * .build()))
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html)
   */
  public inline fun cfnCapacityReservationProps(block: CfnCapacityReservationPropsDsl.() -> Unit =
      {}): CfnCapacityReservationProps {
    val builder = CfnCapacityReservationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The AWS::Athena::DataCatalog resource specifies an Amazon Athena data catalog, which contains a
   * name, description, type, parameters, and tags.
   *
   * For more information, see
   * [DataCatalog](https://docs.aws.amazon.com/athena/latest/APIReference/API_DataCatalog.html) in the
   * *Amazon Athena API Reference* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * CfnDataCatalog cfnDataCatalog = CfnDataCatalog.Builder.create(this, "MyCfnDataCatalog")
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .description("description")
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html)
   */
  public inline fun cfnDataCatalog(
    scope: Construct,
    id: String,
    block: CfnDataCatalogDsl.() -> Unit = {},
  ): CfnDataCatalog {
    val builder = CfnDataCatalogDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnDataCatalog`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * CfnDataCatalogProps cfnDataCatalogProps = CfnDataCatalogProps.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .description("description")
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html)
   */
  public inline fun cfnDataCatalogProps(block: CfnDataCatalogPropsDsl.() -> Unit = {}):
      CfnDataCatalogProps {
    val builder = CfnDataCatalogPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::Athena::NamedQuery` resource specifies an Amazon Athena saved query, where
   * `QueryString` contains the SQL query statements that make up the query.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * CfnNamedQuery cfnNamedQuery = CfnNamedQuery.Builder.create(this, "MyCfnNamedQuery")
   * .database("database")
   * .queryString("queryString")
   * // the properties below are optional
   * .description("description")
   * .name("name")
   * .workGroup("workGroup")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html)
   */
  public inline fun cfnNamedQuery(
    scope: Construct,
    id: String,
    block: CfnNamedQueryDsl.() -> Unit = {},
  ): CfnNamedQuery {
    val builder = CfnNamedQueryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnNamedQuery`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * CfnNamedQueryProps cfnNamedQueryProps = CfnNamedQueryProps.builder()
   * .database("database")
   * .queryString("queryString")
   * // the properties below are optional
   * .description("description")
   * .name("name")
   * .workGroup("workGroup")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html)
   */
  public inline fun cfnNamedQueryProps(block: CfnNamedQueryPropsDsl.() -> Unit = {}):
      CfnNamedQueryProps {
    val builder = CfnNamedQueryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies a prepared statement for use with SQL queries in Athena.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * CfnPreparedStatement cfnPreparedStatement = CfnPreparedStatement.Builder.create(this,
   * "MyCfnPreparedStatement")
   * .queryStatement("queryStatement")
   * .statementName("statementName")
   * .workGroup("workGroup")
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html)
   */
  public inline fun cfnPreparedStatement(
    scope: Construct,
    id: String,
    block: CfnPreparedStatementDsl.() -> Unit = {},
  ): CfnPreparedStatement {
    val builder = CfnPreparedStatementDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnPreparedStatement`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * CfnPreparedStatementProps cfnPreparedStatementProps = CfnPreparedStatementProps.builder()
   * .queryStatement("queryStatement")
   * .statementName("statementName")
   * .workGroup("workGroup")
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html)
   */
  public inline fun cfnPreparedStatementProps(block: CfnPreparedStatementPropsDsl.() -> Unit = {}):
      CfnPreparedStatementProps {
    val builder = CfnPreparedStatementPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The AWS::Athena::WorkGroup resource specifies an Amazon Athena workgroup, which contains a
   * name, description, creation time, state, and other configuration, listed under
   * `WorkGroupConfiguration` .
   *
   * Each workgroup enables you to isolate queries for you or your group from other queries in the
   * same account. For more information, see
   * [CreateWorkGroup](https://docs.aws.amazon.com/athena/latest/APIReference/API_CreateWorkGroup.html)
   * in the *Amazon Athena API Reference* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * CfnWorkGroup cfnWorkGroup = CfnWorkGroup.Builder.create(this, "MyCfnWorkGroup")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .recursiveDeleteOption(false)
   * .state("state")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .workGroupConfiguration(WorkGroupConfigurationProperty.builder()
   * .additionalConfiguration("additionalConfiguration")
   * .bytesScannedCutoffPerQuery(123)
   * .customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty.builder()
   * .kmsKey("kmsKey")
   * .build())
   * .enforceWorkGroupConfiguration(false)
   * .engineVersion(EngineVersionProperty.builder()
   * .effectiveEngineVersion("effectiveEngineVersion")
   * .selectedEngineVersion("selectedEngineVersion")
   * .build())
   * .executionRole("executionRole")
   * .publishCloudWatchMetricsEnabled(false)
   * .requesterPaysEnabled(false)
   * .resultConfiguration(ResultConfigurationProperty.builder()
   * .aclConfiguration(AclConfigurationProperty.builder()
   * .s3AclOption("s3AclOption")
   * .build())
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build())
   * .expectedBucketOwner("expectedBucketOwner")
   * .outputLocation("outputLocation")
   * .build())
   * .build())
   * .workGroupConfigurationUpdates(WorkGroupConfigurationUpdatesProperty.builder()
   * .additionalConfiguration("additionalConfiguration")
   * .bytesScannedCutoffPerQuery(123)
   * .customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty.builder()
   * .kmsKey("kmsKey")
   * .build())
   * .enforceWorkGroupConfiguration(false)
   * .engineVersion(EngineVersionProperty.builder()
   * .effectiveEngineVersion("effectiveEngineVersion")
   * .selectedEngineVersion("selectedEngineVersion")
   * .build())
   * .executionRole("executionRole")
   * .publishCloudWatchMetricsEnabled(false)
   * .removeBytesScannedCutoffPerQuery(false)
   * .removeCustomerContentEncryptionConfiguration(false)
   * .requesterPaysEnabled(false)
   * .resultConfigurationUpdates(ResultConfigurationUpdatesProperty.builder()
   * .aclConfiguration(AclConfigurationProperty.builder()
   * .s3AclOption("s3AclOption")
   * .build())
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build())
   * .expectedBucketOwner("expectedBucketOwner")
   * .outputLocation("outputLocation")
   * .removeAclConfiguration(false)
   * .removeEncryptionConfiguration(false)
   * .removeExpectedBucketOwner(false)
   * .removeOutputLocation(false)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html)
   */
  public inline fun cfnWorkGroup(
    scope: Construct,
    id: String,
    block: CfnWorkGroupDsl.() -> Unit = {},
  ): CfnWorkGroup {
    val builder = CfnWorkGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query
   * results.
   *
   * When Athena stores query results in Amazon S3, the canned ACL is set with the `x-amz-acl`
   * request header. For more information about S3 Object Ownership, see [Object Ownership
   * settings](https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html#object-ownership-overview)
   * in the *Amazon S3 User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * AclConfigurationProperty aclConfigurationProperty = AclConfigurationProperty.builder()
   * .s3AclOption("s3AclOption")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-aclconfiguration.html)
   */
  public inline
      fun cfnWorkGroupAclConfigurationProperty(block: CfnWorkGroupAclConfigurationPropertyDsl.() -> Unit
      = {}): CfnWorkGroup.AclConfigurationProperty {
    val builder = CfnWorkGroupAclConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the KMS key that is used to encrypt the user's data stores in Athena.
   *
   * This setting does not apply to Athena SQL workgroups.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * CustomerContentEncryptionConfigurationProperty customerContentEncryptionConfigurationProperty =
   * CustomerContentEncryptionConfigurationProperty.builder()
   * .kmsKey("kmsKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-customercontentencryptionconfiguration.html)
   */
  public inline
      fun cfnWorkGroupCustomerContentEncryptionConfigurationProperty(block: CfnWorkGroupCustomerContentEncryptionConfigurationPropertyDsl.() -> Unit
      = {}): CfnWorkGroup.CustomerContentEncryptionConfigurationProperty {
    val builder = CfnWorkGroupCustomerContentEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * If query results are encrypted in Amazon S3, indicates the encryption option used (for example,
   * `SSE_KMS` or `CSE_KMS` ) and key information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * EncryptionConfigurationProperty encryptionConfigurationProperty =
   * EncryptionConfigurationProperty.builder()
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html)
   */
  public inline
      fun cfnWorkGroupEncryptionConfigurationProperty(block: CfnWorkGroupEncryptionConfigurationPropertyDsl.() -> Unit
      = {}): CfnWorkGroup.EncryptionConfigurationProperty {
    val builder = CfnWorkGroupEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The Athena engine version for running queries, or the PySpark engine version for running
   * sessions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * EngineVersionProperty engineVersionProperty = EngineVersionProperty.builder()
   * .effectiveEngineVersion("effectiveEngineVersion")
   * .selectedEngineVersion("selectedEngineVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-engineversion.html)
   */
  public inline
      fun cfnWorkGroupEngineVersionProperty(block: CfnWorkGroupEngineVersionPropertyDsl.() -> Unit =
      {}): CfnWorkGroup.EngineVersionProperty {
    val builder = CfnWorkGroupEngineVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnWorkGroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * CfnWorkGroupProps cfnWorkGroupProps = CfnWorkGroupProps.builder()
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .recursiveDeleteOption(false)
   * .state("state")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .workGroupConfiguration(WorkGroupConfigurationProperty.builder()
   * .additionalConfiguration("additionalConfiguration")
   * .bytesScannedCutoffPerQuery(123)
   * .customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty.builder()
   * .kmsKey("kmsKey")
   * .build())
   * .enforceWorkGroupConfiguration(false)
   * .engineVersion(EngineVersionProperty.builder()
   * .effectiveEngineVersion("effectiveEngineVersion")
   * .selectedEngineVersion("selectedEngineVersion")
   * .build())
   * .executionRole("executionRole")
   * .publishCloudWatchMetricsEnabled(false)
   * .requesterPaysEnabled(false)
   * .resultConfiguration(ResultConfigurationProperty.builder()
   * .aclConfiguration(AclConfigurationProperty.builder()
   * .s3AclOption("s3AclOption")
   * .build())
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build())
   * .expectedBucketOwner("expectedBucketOwner")
   * .outputLocation("outputLocation")
   * .build())
   * .build())
   * .workGroupConfigurationUpdates(WorkGroupConfigurationUpdatesProperty.builder()
   * .additionalConfiguration("additionalConfiguration")
   * .bytesScannedCutoffPerQuery(123)
   * .customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty.builder()
   * .kmsKey("kmsKey")
   * .build())
   * .enforceWorkGroupConfiguration(false)
   * .engineVersion(EngineVersionProperty.builder()
   * .effectiveEngineVersion("effectiveEngineVersion")
   * .selectedEngineVersion("selectedEngineVersion")
   * .build())
   * .executionRole("executionRole")
   * .publishCloudWatchMetricsEnabled(false)
   * .removeBytesScannedCutoffPerQuery(false)
   * .removeCustomerContentEncryptionConfiguration(false)
   * .requesterPaysEnabled(false)
   * .resultConfigurationUpdates(ResultConfigurationUpdatesProperty.builder()
   * .aclConfiguration(AclConfigurationProperty.builder()
   * .s3AclOption("s3AclOption")
   * .build())
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build())
   * .expectedBucketOwner("expectedBucketOwner")
   * .outputLocation("outputLocation")
   * .removeAclConfiguration(false)
   * .removeEncryptionConfiguration(false)
   * .removeExpectedBucketOwner(false)
   * .removeOutputLocation(false)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html)
   */
  public inline fun cfnWorkGroupProps(block: CfnWorkGroupPropsDsl.() -> Unit = {}):
      CfnWorkGroupProps {
    val builder = CfnWorkGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The location in Amazon S3 where query and calculation results are stored and the encryption
   * option, if any, used for query and calculation results.
   *
   * These are known as "client-side settings". If workgroup settings override client-side settings,
   * then the query uses the workgroup settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * ResultConfigurationProperty resultConfigurationProperty = ResultConfigurationProperty.builder()
   * .aclConfiguration(AclConfigurationProperty.builder()
   * .s3AclOption("s3AclOption")
   * .build())
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build())
   * .expectedBucketOwner("expectedBucketOwner")
   * .outputLocation("outputLocation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html)
   */
  public inline
      fun cfnWorkGroupResultConfigurationProperty(block: CfnWorkGroupResultConfigurationPropertyDsl.() -> Unit
      = {}): CfnWorkGroup.ResultConfigurationProperty {
    val builder = CfnWorkGroupResultConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The result configuration information about the queries in this workgroup that will be updated.
   *
   * Includes the updated results location and an updated option for encrypting query results.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * ResultConfigurationUpdatesProperty resultConfigurationUpdatesProperty =
   * ResultConfigurationUpdatesProperty.builder()
   * .aclConfiguration(AclConfigurationProperty.builder()
   * .s3AclOption("s3AclOption")
   * .build())
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build())
   * .expectedBucketOwner("expectedBucketOwner")
   * .outputLocation("outputLocation")
   * .removeAclConfiguration(false)
   * .removeEncryptionConfiguration(false)
   * .removeExpectedBucketOwner(false)
   * .removeOutputLocation(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html)
   */
  public inline
      fun cfnWorkGroupResultConfigurationUpdatesProperty(block: CfnWorkGroupResultConfigurationUpdatesPropertyDsl.() -> Unit
      = {}): CfnWorkGroup.ResultConfigurationUpdatesProperty {
    val builder = CfnWorkGroupResultConfigurationUpdatesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The configuration of the workgroup, which includes the location in Amazon S3 where query
   * results are stored, the encryption option, if any, used for query results, whether Amazon
   * CloudWatch Metrics are enabled for the workgroup, and the limit for the amount of bytes scanned
   * (cutoff) per query, if it is specified.
   *
   * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
   * client-side query settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * WorkGroupConfigurationProperty workGroupConfigurationProperty =
   * WorkGroupConfigurationProperty.builder()
   * .additionalConfiguration("additionalConfiguration")
   * .bytesScannedCutoffPerQuery(123)
   * .customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty.builder()
   * .kmsKey("kmsKey")
   * .build())
   * .enforceWorkGroupConfiguration(false)
   * .engineVersion(EngineVersionProperty.builder()
   * .effectiveEngineVersion("effectiveEngineVersion")
   * .selectedEngineVersion("selectedEngineVersion")
   * .build())
   * .executionRole("executionRole")
   * .publishCloudWatchMetricsEnabled(false)
   * .requesterPaysEnabled(false)
   * .resultConfiguration(ResultConfigurationProperty.builder()
   * .aclConfiguration(AclConfigurationProperty.builder()
   * .s3AclOption("s3AclOption")
   * .build())
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build())
   * .expectedBucketOwner("expectedBucketOwner")
   * .outputLocation("outputLocation")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html)
   */
  public inline
      fun cfnWorkGroupWorkGroupConfigurationProperty(block: CfnWorkGroupWorkGroupConfigurationPropertyDsl.() -> Unit
      = {}): CfnWorkGroup.WorkGroupConfigurationProperty {
    val builder = CfnWorkGroupWorkGroupConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The configuration information that will be updated for this workgroup, which includes the
   * location in Amazon S3 where query results are stored, the encryption option, if any, used for
   * query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup, whether the
   * workgroup settings override the client-side settings, and the data usage limit for the amount of
   * bytes scanned per query, if it is specified.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.athena.*;
   * WorkGroupConfigurationUpdatesProperty workGroupConfigurationUpdatesProperty =
   * WorkGroupConfigurationUpdatesProperty.builder()
   * .additionalConfiguration("additionalConfiguration")
   * .bytesScannedCutoffPerQuery(123)
   * .customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty.builder()
   * .kmsKey("kmsKey")
   * .build())
   * .enforceWorkGroupConfiguration(false)
   * .engineVersion(EngineVersionProperty.builder()
   * .effectiveEngineVersion("effectiveEngineVersion")
   * .selectedEngineVersion("selectedEngineVersion")
   * .build())
   * .executionRole("executionRole")
   * .publishCloudWatchMetricsEnabled(false)
   * .removeBytesScannedCutoffPerQuery(false)
   * .removeCustomerContentEncryptionConfiguration(false)
   * .requesterPaysEnabled(false)
   * .resultConfigurationUpdates(ResultConfigurationUpdatesProperty.builder()
   * .aclConfiguration(AclConfigurationProperty.builder()
   * .s3AclOption("s3AclOption")
   * .build())
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build())
   * .expectedBucketOwner("expectedBucketOwner")
   * .outputLocation("outputLocation")
   * .removeAclConfiguration(false)
   * .removeEncryptionConfiguration(false)
   * .removeExpectedBucketOwner(false)
   * .removeOutputLocation(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html)
   */
  public inline
      fun cfnWorkGroupWorkGroupConfigurationUpdatesProperty(block: CfnWorkGroupWorkGroupConfigurationUpdatesPropertyDsl.() -> Unit
      = {}): CfnWorkGroup.WorkGroupConfigurationUpdatesProperty {
    val builder = CfnWorkGroupWorkGroupConfigurationUpdatesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
