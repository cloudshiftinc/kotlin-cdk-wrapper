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

package io.cloudshiftdev.awscdkdsl.services.guardduty

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnDetector
import software.amazon.awscdk.services.guardduty.CfnDetectorProps
import software.amazon.awscdk.services.guardduty.CfnFilter
import software.amazon.awscdk.services.guardduty.CfnFilterProps
import software.amazon.awscdk.services.guardduty.CfnIPSet
import software.amazon.awscdk.services.guardduty.CfnIPSetProps
import software.amazon.awscdk.services.guardduty.CfnMaster
import software.amazon.awscdk.services.guardduty.CfnMasterProps
import software.amazon.awscdk.services.guardduty.CfnMember
import software.amazon.awscdk.services.guardduty.CfnMemberProps
import software.amazon.awscdk.services.guardduty.CfnThreatIntelSet
import software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps
import software.constructs.Construct

public object guardduty {
    /**
     * The `AWS::GuardDuty::Detector` resource specifies a new GuardDuty detector.
     *
     * A detector is an object that represents the GuardDuty service. A detector is required for
     * GuardDuty to become operational.
     *
     * Make sure you use either `DataSources` or `Features` in a one request, and not both.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CfnDetector cfnDetector = CfnDetector.Builder.create(this, "MyCfnDetector")
     * .enable(false)
     * // the properties below are optional
     * .dataSources(CFNDataSourceConfigurationsProperty.builder()
     * .kubernetes(CFNKubernetesConfigurationProperty.builder()
     * .auditLogs(CFNKubernetesAuditLogsConfigurationProperty.builder()
     * .enable(false)
     * .build())
     * .build())
     * .malwareProtection(CFNMalwareProtectionConfigurationProperty.builder()
     * .scanEc2InstanceWithFindings(CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()
     * .ebsVolumes(false)
     * .build())
     * .build())
     * .s3Logs(CFNS3LogsConfigurationProperty.builder()
     * .enable(false)
     * .build())
     * .build())
     * .features(List.of(CFNFeatureConfigurationProperty.builder()
     * .name("name")
     * .status("status")
     * // the properties below are optional
     * .additionalConfiguration(List.of(CFNFeatureAdditionalConfigurationProperty.builder()
     * .name("name")
     * .status("status")
     * .build()))
     * .build()))
     * .findingPublishingFrequency("findingPublishingFrequency")
     * .tags(List.of(TagItemProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html)
     */
    public inline fun cfnDetector(
        scope: Construct,
        id: String,
        block: CfnDetectorDsl.() -> Unit = {},
    ): CfnDetector {
        val builder = CfnDetectorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes whether S3 data event logs, Kubernetes audit logs, or Malware Protection will be
     * enabled as a data source when the detector is created.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CFNDataSourceConfigurationsProperty cFNDataSourceConfigurationsProperty =
     * CFNDataSourceConfigurationsProperty.builder()
     * .kubernetes(CFNKubernetesConfigurationProperty.builder()
     * .auditLogs(CFNKubernetesAuditLogsConfigurationProperty.builder()
     * .enable(false)
     * .build())
     * .build())
     * .malwareProtection(CFNMalwareProtectionConfigurationProperty.builder()
     * .scanEc2InstanceWithFindings(CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()
     * .ebsVolumes(false)
     * .build())
     * .build())
     * .s3Logs(CFNS3LogsConfigurationProperty.builder()
     * .enable(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfndatasourceconfigurations.html)
     */
    public inline fun cfnDetectorCFNDataSourceConfigurationsProperty(
        block: CfnDetectorCFNDataSourceConfigurationsPropertyDsl.() -> Unit = {}
    ): CfnDetector.CFNDataSourceConfigurationsProperty {
        val builder = CfnDetectorCFNDataSourceConfigurationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the additional configuration of a feature in your account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CFNFeatureAdditionalConfigurationProperty cFNFeatureAdditionalConfigurationProperty =
     * CFNFeatureAdditionalConfigurationProperty.builder()
     * .name("name")
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureadditionalconfiguration.html)
     */
    public inline fun cfnDetectorCFNFeatureAdditionalConfigurationProperty(
        block: CfnDetectorCFNFeatureAdditionalConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDetector.CFNFeatureAdditionalConfigurationProperty {
        val builder = CfnDetectorCFNFeatureAdditionalConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the configuration of a feature in your account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CFNFeatureConfigurationProperty cFNFeatureConfigurationProperty =
     * CFNFeatureConfigurationProperty.builder()
     * .name("name")
     * .status("status")
     * // the properties below are optional
     * .additionalConfiguration(List.of(CFNFeatureAdditionalConfigurationProperty.builder()
     * .name("name")
     * .status("status")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureconfiguration.html)
     */
    public inline fun cfnDetectorCFNFeatureConfigurationProperty(
        block: CfnDetectorCFNFeatureConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDetector.CFNFeatureConfigurationProperty {
        val builder = CfnDetectorCFNFeatureConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes which optional data sources are enabled for a detector.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CFNKubernetesAuditLogsConfigurationProperty cFNKubernetesAuditLogsConfigurationProperty =
     * CFNKubernetesAuditLogsConfigurationProperty.builder()
     * .enable(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnkubernetesauditlogsconfiguration.html)
     */
    public inline fun cfnDetectorCFNKubernetesAuditLogsConfigurationProperty(
        block: CfnDetectorCFNKubernetesAuditLogsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDetector.CFNKubernetesAuditLogsConfigurationProperty {
        val builder = CfnDetectorCFNKubernetesAuditLogsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes which Kubernetes protection data sources are enabled for the detector.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CFNKubernetesConfigurationProperty cFNKubernetesConfigurationProperty =
     * CFNKubernetesConfigurationProperty.builder()
     * .auditLogs(CFNKubernetesAuditLogsConfigurationProperty.builder()
     * .enable(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnkubernetesconfiguration.html)
     */
    public inline fun cfnDetectorCFNKubernetesConfigurationProperty(
        block: CfnDetectorCFNKubernetesConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDetector.CFNKubernetesConfigurationProperty {
        val builder = CfnDetectorCFNKubernetesConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes whether Malware Protection will be enabled as a data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CFNMalwareProtectionConfigurationProperty cFNMalwareProtectionConfigurationProperty =
     * CFNMalwareProtectionConfigurationProperty.builder()
     * .scanEc2InstanceWithFindings(CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()
     * .ebsVolumes(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnmalwareprotectionconfiguration.html)
     */
    public inline fun cfnDetectorCFNMalwareProtectionConfigurationProperty(
        block: CfnDetectorCFNMalwareProtectionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDetector.CFNMalwareProtectionConfigurationProperty {
        val builder = CfnDetectorCFNMalwareProtectionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes whether S3 data event logs will be enabled as a data source when the detector is
     * created.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CFNS3LogsConfigurationProperty cFNS3LogsConfigurationProperty =
     * CFNS3LogsConfigurationProperty.builder()
     * .enable(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfns3logsconfiguration.html)
     */
    public inline fun cfnDetectorCFNS3LogsConfigurationProperty(
        block: CfnDetectorCFNS3LogsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDetector.CFNS3LogsConfigurationProperty {
        val builder = CfnDetectorCFNS3LogsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes whether Malware Protection for EC2 instances with findings will be enabled as a
     * data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CFNScanEc2InstanceWithFindingsConfigurationProperty
     * cFNScanEc2InstanceWithFindingsConfigurationProperty =
     * CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()
     * .ebsVolumes(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnscanec2instancewithfindingsconfiguration.html)
     */
    public inline fun cfnDetectorCFNScanEc2InstanceWithFindingsConfigurationProperty(
        block: CfnDetectorCFNScanEc2InstanceWithFindingsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty {
        val builder = CfnDetectorCFNScanEc2InstanceWithFindingsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDetector`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CfnDetectorProps cfnDetectorProps = CfnDetectorProps.builder()
     * .enable(false)
     * // the properties below are optional
     * .dataSources(CFNDataSourceConfigurationsProperty.builder()
     * .kubernetes(CFNKubernetesConfigurationProperty.builder()
     * .auditLogs(CFNKubernetesAuditLogsConfigurationProperty.builder()
     * .enable(false)
     * .build())
     * .build())
     * .malwareProtection(CFNMalwareProtectionConfigurationProperty.builder()
     * .scanEc2InstanceWithFindings(CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()
     * .ebsVolumes(false)
     * .build())
     * .build())
     * .s3Logs(CFNS3LogsConfigurationProperty.builder()
     * .enable(false)
     * .build())
     * .build())
     * .features(List.of(CFNFeatureConfigurationProperty.builder()
     * .name("name")
     * .status("status")
     * // the properties below are optional
     * .additionalConfiguration(List.of(CFNFeatureAdditionalConfigurationProperty.builder()
     * .name("name")
     * .status("status")
     * .build()))
     * .build()))
     * .findingPublishingFrequency("findingPublishingFrequency")
     * .tags(List.of(TagItemProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html)
     */
    public inline fun cfnDetectorProps(
        block: CfnDetectorPropsDsl.() -> Unit = {}
    ): CfnDetectorProps {
        val builder = CfnDetectorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a tag.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * TagItemProperty tagItemProperty = TagItemProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-tagitem.html)
     */
    public inline fun cfnDetectorTagItemProperty(
        block: CfnDetectorTagItemPropertyDsl.() -> Unit = {}
    ): CfnDetector.TagItemProperty {
        val builder = CfnDetectorTagItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::GuardDuty::Filter` resource specifies a new filter defined by the provided
     * `findingCriteria` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * Object criterion;
     * CfnFilter cfnFilter = CfnFilter.Builder.create(this, "MyCfnFilter")
     * .findingCriteria(FindingCriteriaProperty.builder()
     * .criterion(criterion)
     * .itemType(ConditionProperty.builder()
     * .eq(List.of("eq"))
     * .equalTo(List.of("equalTo"))
     * .greaterThan(123)
     * .greaterThanOrEqual(123)
     * .gt(123)
     * .gte(123)
     * .lessThan(123)
     * .lessThanOrEqual(123)
     * .lt(123)
     * .lte(123)
     * .neq(List.of("neq"))
     * .notEquals(List.of("notEquals"))
     * .build())
     * .build())
     * // the properties below are optional
     * .action("action")
     * .description("description")
     * .detectorId("detectorId")
     * .name("name")
     * .rank(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html)
     */
    public inline fun cfnFilter(
        scope: Construct,
        id: String,
        block: CfnFilterDsl.() -> Unit = {},
    ): CfnFilter {
        val builder = CfnFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the condition to apply to a single field when filtering through GuardDuty findings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * ConditionProperty conditionProperty = ConditionProperty.builder()
     * .eq(List.of("eq"))
     * .equalTo(List.of("equalTo"))
     * .greaterThan(123)
     * .greaterThanOrEqual(123)
     * .gt(123)
     * .gte(123)
     * .lessThan(123)
     * .lessThanOrEqual(123)
     * .lt(123)
     * .lte(123)
     * .neq(List.of("neq"))
     * .notEquals(List.of("notEquals"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html)
     */
    public inline fun cfnFilterConditionProperty(
        block: CfnFilterConditionPropertyDsl.() -> Unit = {}
    ): CfnFilter.ConditionProperty {
        val builder = CfnFilterConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a map of finding properties that match specified conditions and values when
     * querying findings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * Object criterion;
     * FindingCriteriaProperty findingCriteriaProperty = FindingCriteriaProperty.builder()
     * .criterion(criterion)
     * .itemType(ConditionProperty.builder()
     * .eq(List.of("eq"))
     * .equalTo(List.of("equalTo"))
     * .greaterThan(123)
     * .greaterThanOrEqual(123)
     * .gt(123)
     * .gte(123)
     * .lessThan(123)
     * .lessThanOrEqual(123)
     * .lt(123)
     * .lte(123)
     * .neq(List.of("neq"))
     * .notEquals(List.of("notEquals"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html)
     */
    public inline fun cfnFilterFindingCriteriaProperty(
        block: CfnFilterFindingCriteriaPropertyDsl.() -> Unit = {}
    ): CfnFilter.FindingCriteriaProperty {
        val builder = CfnFilterFindingCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFilter`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * Object criterion;
     * CfnFilterProps cfnFilterProps = CfnFilterProps.builder()
     * .findingCriteria(FindingCriteriaProperty.builder()
     * .criterion(criterion)
     * .itemType(ConditionProperty.builder()
     * .eq(List.of("eq"))
     * .equalTo(List.of("equalTo"))
     * .greaterThan(123)
     * .greaterThanOrEqual(123)
     * .gt(123)
     * .gte(123)
     * .lessThan(123)
     * .lessThanOrEqual(123)
     * .lt(123)
     * .lte(123)
     * .neq(List.of("neq"))
     * .notEquals(List.of("notEquals"))
     * .build())
     * .build())
     * // the properties below are optional
     * .action("action")
     * .description("description")
     * .detectorId("detectorId")
     * .name("name")
     * .rank(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html)
     */
    public inline fun cfnFilterProps(block: CfnFilterPropsDsl.() -> Unit = {}): CfnFilterProps {
        val builder = CfnFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::GuardDuty::IPSet` resource specifies a new `IPSet` .
     *
     * An `IPSet` is a list of trusted IP addresses from which secure communication is allowed with
     * AWS infrastructure and applications.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CfnIPSet cfnIPSet = CfnIPSet.Builder.create(this, "MyCfnIPSet")
     * .format("format")
     * .location("location")
     * // the properties below are optional
     * .activate(false)
     * .detectorId("detectorId")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html)
     */
    public inline fun cfnIPSet(
        scope: Construct,
        id: String,
        block: CfnIPSetDsl.() -> Unit = {},
    ): CfnIPSet {
        val builder = CfnIPSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIPSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CfnIPSetProps cfnIPSetProps = CfnIPSetProps.builder()
     * .format("format")
     * .location("location")
     * // the properties below are optional
     * .activate(false)
     * .detectorId("detectorId")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html)
     */
    public inline fun cfnIPSetProps(block: CfnIPSetPropsDsl.() -> Unit = {}): CfnIPSetProps {
        val builder = CfnIPSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * You can use the `AWS::GuardDuty::Master` resource in a GuardDuty member account to accept an
     * invitation from a GuardDuty administrator account.
     *
     * The invitation to the member account must be sent prior to using the `AWS::GuardDuty::Master`
     * resource to accept the administrator account's invitation. You can invite a member account by
     * using the `InviteMembers` operation of the GuardDuty API, or by creating an
     * `AWS::GuardDuty::Member` resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CfnMaster cfnMaster = CfnMaster.Builder.create(this, "MyCfnMaster")
     * .detectorId("detectorId")
     * .masterId("masterId")
     * // the properties below are optional
     * .invitationId("invitationId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html)
     */
    public inline fun cfnMaster(
        scope: Construct,
        id: String,
        block: CfnMasterDsl.() -> Unit = {},
    ): CfnMaster {
        val builder = CfnMasterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMaster`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CfnMasterProps cfnMasterProps = CfnMasterProps.builder()
     * .detectorId("detectorId")
     * .masterId("masterId")
     * // the properties below are optional
     * .invitationId("invitationId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html)
     */
    public inline fun cfnMasterProps(block: CfnMasterPropsDsl.() -> Unit = {}): CfnMasterProps {
        val builder = CfnMasterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * You can use the `AWS::GuardDuty::Member` resource to add an AWS account as a GuardDuty member
     * account to the current GuardDuty administrator account.
     *
     * If the value of the `Status` property is not provided or is set to `Created` , a member
     * account is created but not invited. If the value of the `Status` property is set to `Invited`
     * , a member account is created and invited. An `AWS::GuardDuty::Member` resource must be
     * created with the `Status` property set to `Invited` before the `AWS::GuardDuty::Master`
     * resource can be created in a GuardDuty member account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CfnMember cfnMember = CfnMember.Builder.create(this, "MyCfnMember")
     * .email("email")
     * // the properties below are optional
     * .detectorId("detectorId")
     * .disableEmailNotification(false)
     * .memberId("memberId")
     * .message("message")
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html)
     */
    public inline fun cfnMember(
        scope: Construct,
        id: String,
        block: CfnMemberDsl.() -> Unit = {},
    ): CfnMember {
        val builder = CfnMemberDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMember`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CfnMemberProps cfnMemberProps = CfnMemberProps.builder()
     * .email("email")
     * // the properties below are optional
     * .detectorId("detectorId")
     * .disableEmailNotification(false)
     * .memberId("memberId")
     * .message("message")
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html)
     */
    public inline fun cfnMemberProps(block: CfnMemberPropsDsl.() -> Unit = {}): CfnMemberProps {
        val builder = CfnMemberPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::GuardDuty::ThreatIntelSet` resource specifies a new `ThreatIntelSet` .
     *
     * A `ThreatIntelSet` consists of known malicious IP addresses. GuardDuty generates findings
     * based on the `ThreatIntelSet` when it is activated.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CfnThreatIntelSet cfnThreatIntelSet = CfnThreatIntelSet.Builder.create(this,
     * "MyCfnThreatIntelSet")
     * .format("format")
     * .location("location")
     * // the properties below are optional
     * .activate(false)
     * .detectorId("detectorId")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html)
     */
    public inline fun cfnThreatIntelSet(
        scope: Construct,
        id: String,
        block: CfnThreatIntelSetDsl.() -> Unit = {},
    ): CfnThreatIntelSet {
        val builder = CfnThreatIntelSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnThreatIntelSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.guardduty.*;
     * CfnThreatIntelSetProps cfnThreatIntelSetProps = CfnThreatIntelSetProps.builder()
     * .format("format")
     * .location("location")
     * // the properties below are optional
     * .activate(false)
     * .detectorId("detectorId")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html)
     */
    public inline fun cfnThreatIntelSetProps(
        block: CfnThreatIntelSetPropsDsl.() -> Unit = {}
    ): CfnThreatIntelSetProps {
        val builder = CfnThreatIntelSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
