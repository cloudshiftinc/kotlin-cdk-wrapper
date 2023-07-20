@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.guardduty

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
import kotlin.String
import kotlin.Unit

public object guardduty {
    public inline fun cfnDetector(
        scope: Construct,
        id: String,
        block: CfnDetectorDsl.() -> Unit = {},
    ): CfnDetector {
        val builder = CfnDetectorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDetectorCFNDataSourceConfigurationsProperty(
        block: CfnDetectorCFNDataSourceConfigurationsPropertyDsl.() -> Unit =
            {},
    ): CfnDetector.CFNDataSourceConfigurationsProperty {
        val builder = CfnDetectorCFNDataSourceConfigurationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDetectorCFNKubernetesAuditLogsConfigurationProperty(
        block: CfnDetectorCFNKubernetesAuditLogsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDetector.CFNKubernetesAuditLogsConfigurationProperty {
        val builder = CfnDetectorCFNKubernetesAuditLogsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDetectorCFNKubernetesConfigurationProperty(
        block: CfnDetectorCFNKubernetesConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDetector.CFNKubernetesConfigurationProperty {
        val builder = CfnDetectorCFNKubernetesConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDetectorCFNMalwareProtectionConfigurationProperty(
        block: CfnDetectorCFNMalwareProtectionConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDetector.CFNMalwareProtectionConfigurationProperty {
        val builder = CfnDetectorCFNMalwareProtectionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDetectorCFNS3LogsConfigurationProperty(
        block: CfnDetectorCFNS3LogsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDetector.CFNS3LogsConfigurationProperty {
        val builder = CfnDetectorCFNS3LogsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDetectorCFNScanEc2InstanceWithFindingsConfigurationProperty(
        block: CfnDetectorCFNScanEc2InstanceWithFindingsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty {
        val builder = CfnDetectorCFNScanEc2InstanceWithFindingsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDetectorFeatureAdditionalConfigurationProperty(
        block: CfnDetectorFeatureAdditionalConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDetector.FeatureAdditionalConfigurationProperty {
        val builder = CfnDetectorFeatureAdditionalConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDetectorFeatureConfigurationsProperty(
        block: CfnDetectorFeatureConfigurationsPropertyDsl.() -> Unit =
            {},
    ): CfnDetector.FeatureConfigurationsProperty {
        val builder = CfnDetectorFeatureConfigurationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDetectorProps(block: CfnDetectorPropsDsl.() -> Unit = {}): CfnDetectorProps {
        val builder = CfnDetectorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFilter(
        scope: Construct,
        id: String,
        block: CfnFilterDsl.() -> Unit = {},
    ): CfnFilter {
        val builder = CfnFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFilterConditionProperty(
        block: CfnFilterConditionPropertyDsl.() -> Unit =
            {},
    ): CfnFilter.ConditionProperty {
        val builder = CfnFilterConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFilterFindingCriteriaProperty(
        block: CfnFilterFindingCriteriaPropertyDsl.() -> Unit =
            {},
    ): CfnFilter.FindingCriteriaProperty {
        val builder = CfnFilterFindingCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFilterProps(block: CfnFilterPropsDsl.() -> Unit = {}): CfnFilterProps {
        val builder = CfnFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIPSet(
        scope: Construct,
        id: String,
        block: CfnIPSetDsl.() -> Unit = {},
    ): CfnIPSet {
        val builder = CfnIPSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIPSetProps(block: CfnIPSetPropsDsl.() -> Unit = {}): CfnIPSetProps {
        val builder = CfnIPSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMaster(
        scope: Construct,
        id: String,
        block: CfnMasterDsl.() -> Unit = {},
    ): CfnMaster {
        val builder = CfnMasterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMasterProps(block: CfnMasterPropsDsl.() -> Unit = {}): CfnMasterProps {
        val builder = CfnMasterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMember(
        scope: Construct,
        id: String,
        block: CfnMemberDsl.() -> Unit = {},
    ): CfnMember {
        val builder = CfnMemberDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMemberProps(block: CfnMemberPropsDsl.() -> Unit = {}): CfnMemberProps {
        val builder = CfnMemberPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnThreatIntelSet(
        scope: Construct,
        id: String,
        block: CfnThreatIntelSetDsl.() -> Unit = {},
    ): CfnThreatIntelSet {
        val builder = CfnThreatIntelSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnThreatIntelSetProps(block: CfnThreatIntelSetPropsDsl.() -> Unit = {}): CfnThreatIntelSetProps {
        val builder = CfnThreatIntelSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
