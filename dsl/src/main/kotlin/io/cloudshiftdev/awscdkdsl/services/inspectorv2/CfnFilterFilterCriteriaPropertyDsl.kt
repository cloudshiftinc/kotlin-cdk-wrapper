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

package io.cloudshiftdev.awscdkdsl.services.inspectorv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspectorv2.CfnFilter

/**
 * Details on the criteria used to define the filter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspectorv2.*;
 * FilterCriteriaProperty filterCriteriaProperty = FilterCriteriaProperty.builder()
 * .awsAccountId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .componentId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .componentType(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ec2InstanceImageId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ec2InstanceSubnetId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ec2InstanceVpcId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ecrImageArchitecture(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ecrImageHash(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ecrImagePushedAt(List.of(DateFilterProperty.builder()
 * .endInclusive(123)
 * .startInclusive(123)
 * .build()))
 * .ecrImageRegistry(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ecrImageRepositoryName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ecrImageTags(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .findingArn(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .findingStatus(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .findingType(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .firstObservedAt(List.of(DateFilterProperty.builder()
 * .endInclusive(123)
 * .startInclusive(123)
 * .build()))
 * .inspectorScore(List.of(NumberFilterProperty.builder()
 * .lowerInclusive(123)
 * .upperInclusive(123)
 * .build()))
 * .lastObservedAt(List.of(DateFilterProperty.builder()
 * .endInclusive(123)
 * .startInclusive(123)
 * .build()))
 * .networkProtocol(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .portRange(List.of(PortRangeFilterProperty.builder()
 * .beginInclusive(123)
 * .endInclusive(123)
 * .build()))
 * .relatedVulnerabilities(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceTags(List.of(MapFilterProperty.builder()
 * .comparison("comparison")
 * // the properties below are optional
 * .key("key")
 * .value("value")
 * .build()))
 * .resourceType(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .severity(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .title(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .updatedAt(List.of(DateFilterProperty.builder()
 * .endInclusive(123)
 * .startInclusive(123)
 * .build()))
 * .vendorSeverity(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .vulnerabilityId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .vulnerabilitySource(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .vulnerablePackages(List.of(PackageFilterProperty.builder()
 * .architecture(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .epoch(NumberFilterProperty.builder()
 * .lowerInclusive(123)
 * .upperInclusive(123)
 * .build())
 * .name(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .release(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .sourceLayerHash(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .version(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html)
 */
@CdkDslMarker
public class CfnFilterFilterCriteriaPropertyDsl {
    private val cdkBuilder: CfnFilter.FilterCriteriaProperty.Builder =
        CfnFilter.FilterCriteriaProperty.builder()

    private val _awsAccountId: MutableList<Any> = mutableListOf()

    private val _componentId: MutableList<Any> = mutableListOf()

    private val _componentType: MutableList<Any> = mutableListOf()

    private val _ec2InstanceImageId: MutableList<Any> = mutableListOf()

    private val _ec2InstanceSubnetId: MutableList<Any> = mutableListOf()

    private val _ec2InstanceVpcId: MutableList<Any> = mutableListOf()

    private val _ecrImageArchitecture: MutableList<Any> = mutableListOf()

    private val _ecrImageHash: MutableList<Any> = mutableListOf()

    private val _ecrImagePushedAt: MutableList<Any> = mutableListOf()

    private val _ecrImageRegistry: MutableList<Any> = mutableListOf()

    private val _ecrImageRepositoryName: MutableList<Any> = mutableListOf()

    private val _ecrImageTags: MutableList<Any> = mutableListOf()

    private val _findingArn: MutableList<Any> = mutableListOf()

    private val _findingStatus: MutableList<Any> = mutableListOf()

    private val _findingType: MutableList<Any> = mutableListOf()

    private val _firstObservedAt: MutableList<Any> = mutableListOf()

    private val _inspectorScore: MutableList<Any> = mutableListOf()

    private val _lastObservedAt: MutableList<Any> = mutableListOf()

    private val _networkProtocol: MutableList<Any> = mutableListOf()

    private val _portRange: MutableList<Any> = mutableListOf()

    private val _relatedVulnerabilities: MutableList<Any> = mutableListOf()

    private val _resourceId: MutableList<Any> = mutableListOf()

    private val _resourceTags: MutableList<Any> = mutableListOf()

    private val _resourceType: MutableList<Any> = mutableListOf()

    private val _severity: MutableList<Any> = mutableListOf()

    private val _title: MutableList<Any> = mutableListOf()

    private val _updatedAt: MutableList<Any> = mutableListOf()

    private val _vendorSeverity: MutableList<Any> = mutableListOf()

    private val _vulnerabilityId: MutableList<Any> = mutableListOf()

    private val _vulnerabilitySource: MutableList<Any> = mutableListOf()

    private val _vulnerablePackages: MutableList<Any> = mutableListOf()

    /** @param awsAccountId Details of the AWS account IDs used to filter findings. */
    public fun awsAccountId(vararg awsAccountId: Any) {
        _awsAccountId.addAll(listOf(*awsAccountId))
    }

    /** @param awsAccountId Details of the AWS account IDs used to filter findings. */
    public fun awsAccountId(awsAccountId: Collection<Any>) {
        _awsAccountId.addAll(awsAccountId)
    }

    /** @param awsAccountId Details of the AWS account IDs used to filter findings. */
    public fun awsAccountId(awsAccountId: IResolvable) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    /** @param componentId Details of the component IDs used to filter findings. */
    public fun componentId(vararg componentId: Any) {
        _componentId.addAll(listOf(*componentId))
    }

    /** @param componentId Details of the component IDs used to filter findings. */
    public fun componentId(componentId: Collection<Any>) {
        _componentId.addAll(componentId)
    }

    /** @param componentId Details of the component IDs used to filter findings. */
    public fun componentId(componentId: IResolvable) {
        cdkBuilder.componentId(componentId)
    }

    /** @param componentType Details of the component types used to filter findings. */
    public fun componentType(vararg componentType: Any) {
        _componentType.addAll(listOf(*componentType))
    }

    /** @param componentType Details of the component types used to filter findings. */
    public fun componentType(componentType: Collection<Any>) {
        _componentType.addAll(componentType)
    }

    /** @param componentType Details of the component types used to filter findings. */
    public fun componentType(componentType: IResolvable) {
        cdkBuilder.componentType(componentType)
    }

    /**
     * @param ec2InstanceImageId Details of the Amazon EC2 instance image IDs used to filter
     *   findings.
     */
    public fun ec2InstanceImageId(vararg ec2InstanceImageId: Any) {
        _ec2InstanceImageId.addAll(listOf(*ec2InstanceImageId))
    }

    /**
     * @param ec2InstanceImageId Details of the Amazon EC2 instance image IDs used to filter
     *   findings.
     */
    public fun ec2InstanceImageId(ec2InstanceImageId: Collection<Any>) {
        _ec2InstanceImageId.addAll(ec2InstanceImageId)
    }

    /**
     * @param ec2InstanceImageId Details of the Amazon EC2 instance image IDs used to filter
     *   findings.
     */
    public fun ec2InstanceImageId(ec2InstanceImageId: IResolvable) {
        cdkBuilder.ec2InstanceImageId(ec2InstanceImageId)
    }

    /**
     * @param ec2InstanceSubnetId Details of the Amazon EC2 instance subnet IDs used to filter
     *   findings.
     */
    public fun ec2InstanceSubnetId(vararg ec2InstanceSubnetId: Any) {
        _ec2InstanceSubnetId.addAll(listOf(*ec2InstanceSubnetId))
    }

    /**
     * @param ec2InstanceSubnetId Details of the Amazon EC2 instance subnet IDs used to filter
     *   findings.
     */
    public fun ec2InstanceSubnetId(ec2InstanceSubnetId: Collection<Any>) {
        _ec2InstanceSubnetId.addAll(ec2InstanceSubnetId)
    }

    /**
     * @param ec2InstanceSubnetId Details of the Amazon EC2 instance subnet IDs used to filter
     *   findings.
     */
    public fun ec2InstanceSubnetId(ec2InstanceSubnetId: IResolvable) {
        cdkBuilder.ec2InstanceSubnetId(ec2InstanceSubnetId)
    }

    /**
     * @param ec2InstanceVpcId Details of the Amazon EC2 instance VPC IDs used to filter findings.
     */
    public fun ec2InstanceVpcId(vararg ec2InstanceVpcId: Any) {
        _ec2InstanceVpcId.addAll(listOf(*ec2InstanceVpcId))
    }

    /**
     * @param ec2InstanceVpcId Details of the Amazon EC2 instance VPC IDs used to filter findings.
     */
    public fun ec2InstanceVpcId(ec2InstanceVpcId: Collection<Any>) {
        _ec2InstanceVpcId.addAll(ec2InstanceVpcId)
    }

    /**
     * @param ec2InstanceVpcId Details of the Amazon EC2 instance VPC IDs used to filter findings.
     */
    public fun ec2InstanceVpcId(ec2InstanceVpcId: IResolvable) {
        cdkBuilder.ec2InstanceVpcId(ec2InstanceVpcId)
    }

    /**
     * @param ecrImageArchitecture Details of the Amazon ECR image architecture types used to filter
     *   findings.
     */
    public fun ecrImageArchitecture(vararg ecrImageArchitecture: Any) {
        _ecrImageArchitecture.addAll(listOf(*ecrImageArchitecture))
    }

    /**
     * @param ecrImageArchitecture Details of the Amazon ECR image architecture types used to filter
     *   findings.
     */
    public fun ecrImageArchitecture(ecrImageArchitecture: Collection<Any>) {
        _ecrImageArchitecture.addAll(ecrImageArchitecture)
    }

    /**
     * @param ecrImageArchitecture Details of the Amazon ECR image architecture types used to filter
     *   findings.
     */
    public fun ecrImageArchitecture(ecrImageArchitecture: IResolvable) {
        cdkBuilder.ecrImageArchitecture(ecrImageArchitecture)
    }

    /** @param ecrImageHash Details of the Amazon ECR image hashes used to filter findings. */
    public fun ecrImageHash(vararg ecrImageHash: Any) {
        _ecrImageHash.addAll(listOf(*ecrImageHash))
    }

    /** @param ecrImageHash Details of the Amazon ECR image hashes used to filter findings. */
    public fun ecrImageHash(ecrImageHash: Collection<Any>) {
        _ecrImageHash.addAll(ecrImageHash)
    }

    /** @param ecrImageHash Details of the Amazon ECR image hashes used to filter findings. */
    public fun ecrImageHash(ecrImageHash: IResolvable) {
        cdkBuilder.ecrImageHash(ecrImageHash)
    }

    /**
     * @param ecrImagePushedAt Details on the Amazon ECR image push date and time used to filter
     *   findings.
     */
    public fun ecrImagePushedAt(vararg ecrImagePushedAt: Any) {
        _ecrImagePushedAt.addAll(listOf(*ecrImagePushedAt))
    }

    /**
     * @param ecrImagePushedAt Details on the Amazon ECR image push date and time used to filter
     *   findings.
     */
    public fun ecrImagePushedAt(ecrImagePushedAt: Collection<Any>) {
        _ecrImagePushedAt.addAll(ecrImagePushedAt)
    }

    /**
     * @param ecrImagePushedAt Details on the Amazon ECR image push date and time used to filter
     *   findings.
     */
    public fun ecrImagePushedAt(ecrImagePushedAt: IResolvable) {
        cdkBuilder.ecrImagePushedAt(ecrImagePushedAt)
    }

    /** @param ecrImageRegistry Details on the Amazon ECR registry used to filter findings. */
    public fun ecrImageRegistry(vararg ecrImageRegistry: Any) {
        _ecrImageRegistry.addAll(listOf(*ecrImageRegistry))
    }

    /** @param ecrImageRegistry Details on the Amazon ECR registry used to filter findings. */
    public fun ecrImageRegistry(ecrImageRegistry: Collection<Any>) {
        _ecrImageRegistry.addAll(ecrImageRegistry)
    }

    /** @param ecrImageRegistry Details on the Amazon ECR registry used to filter findings. */
    public fun ecrImageRegistry(ecrImageRegistry: IResolvable) {
        cdkBuilder.ecrImageRegistry(ecrImageRegistry)
    }

    /**
     * @param ecrImageRepositoryName Details on the name of the Amazon ECR repository used to filter
     *   findings.
     */
    public fun ecrImageRepositoryName(vararg ecrImageRepositoryName: Any) {
        _ecrImageRepositoryName.addAll(listOf(*ecrImageRepositoryName))
    }

    /**
     * @param ecrImageRepositoryName Details on the name of the Amazon ECR repository used to filter
     *   findings.
     */
    public fun ecrImageRepositoryName(ecrImageRepositoryName: Collection<Any>) {
        _ecrImageRepositoryName.addAll(ecrImageRepositoryName)
    }

    /**
     * @param ecrImageRepositoryName Details on the name of the Amazon ECR repository used to filter
     *   findings.
     */
    public fun ecrImageRepositoryName(ecrImageRepositoryName: IResolvable) {
        cdkBuilder.ecrImageRepositoryName(ecrImageRepositoryName)
    }

    /** @param ecrImageTags The tags attached to the Amazon ECR container image. */
    public fun ecrImageTags(vararg ecrImageTags: Any) {
        _ecrImageTags.addAll(listOf(*ecrImageTags))
    }

    /** @param ecrImageTags The tags attached to the Amazon ECR container image. */
    public fun ecrImageTags(ecrImageTags: Collection<Any>) {
        _ecrImageTags.addAll(ecrImageTags)
    }

    /** @param ecrImageTags The tags attached to the Amazon ECR container image. */
    public fun ecrImageTags(ecrImageTags: IResolvable) {
        cdkBuilder.ecrImageTags(ecrImageTags)
    }

    /** @param findingArn Details on the finding ARNs used to filter findings. */
    public fun findingArn(vararg findingArn: Any) {
        _findingArn.addAll(listOf(*findingArn))
    }

    /** @param findingArn Details on the finding ARNs used to filter findings. */
    public fun findingArn(findingArn: Collection<Any>) {
        _findingArn.addAll(findingArn)
    }

    /** @param findingArn Details on the finding ARNs used to filter findings. */
    public fun findingArn(findingArn: IResolvable) {
        cdkBuilder.findingArn(findingArn)
    }

    /** @param findingStatus Details on the finding status types used to filter findings. */
    public fun findingStatus(vararg findingStatus: Any) {
        _findingStatus.addAll(listOf(*findingStatus))
    }

    /** @param findingStatus Details on the finding status types used to filter findings. */
    public fun findingStatus(findingStatus: Collection<Any>) {
        _findingStatus.addAll(findingStatus)
    }

    /** @param findingStatus Details on the finding status types used to filter findings. */
    public fun findingStatus(findingStatus: IResolvable) {
        cdkBuilder.findingStatus(findingStatus)
    }

    /** @param findingType Details on the finding types used to filter findings. */
    public fun findingType(vararg findingType: Any) {
        _findingType.addAll(listOf(*findingType))
    }

    /** @param findingType Details on the finding types used to filter findings. */
    public fun findingType(findingType: Collection<Any>) {
        _findingType.addAll(findingType)
    }

    /** @param findingType Details on the finding types used to filter findings. */
    public fun findingType(findingType: IResolvable) {
        cdkBuilder.findingType(findingType)
    }

    /**
     * @param firstObservedAt Details on the date and time a finding was first seen used to filter
     *   findings.
     */
    public fun firstObservedAt(vararg firstObservedAt: Any) {
        _firstObservedAt.addAll(listOf(*firstObservedAt))
    }

    /**
     * @param firstObservedAt Details on the date and time a finding was first seen used to filter
     *   findings.
     */
    public fun firstObservedAt(firstObservedAt: Collection<Any>) {
        _firstObservedAt.addAll(firstObservedAt)
    }

    /**
     * @param firstObservedAt Details on the date and time a finding was first seen used to filter
     *   findings.
     */
    public fun firstObservedAt(firstObservedAt: IResolvable) {
        cdkBuilder.firstObservedAt(firstObservedAt)
    }

    /** @param inspectorScore The Amazon Inspector score to filter on. */
    public fun inspectorScore(vararg inspectorScore: Any) {
        _inspectorScore.addAll(listOf(*inspectorScore))
    }

    /** @param inspectorScore The Amazon Inspector score to filter on. */
    public fun inspectorScore(inspectorScore: Collection<Any>) {
        _inspectorScore.addAll(inspectorScore)
    }

    /** @param inspectorScore The Amazon Inspector score to filter on. */
    public fun inspectorScore(inspectorScore: IResolvable) {
        cdkBuilder.inspectorScore(inspectorScore)
    }

    /**
     * @param lastObservedAt Details on the date and time a finding was last seen used to filter
     *   findings.
     */
    public fun lastObservedAt(vararg lastObservedAt: Any) {
        _lastObservedAt.addAll(listOf(*lastObservedAt))
    }

    /**
     * @param lastObservedAt Details on the date and time a finding was last seen used to filter
     *   findings.
     */
    public fun lastObservedAt(lastObservedAt: Collection<Any>) {
        _lastObservedAt.addAll(lastObservedAt)
    }

    /**
     * @param lastObservedAt Details on the date and time a finding was last seen used to filter
     *   findings.
     */
    public fun lastObservedAt(lastObservedAt: IResolvable) {
        cdkBuilder.lastObservedAt(lastObservedAt)
    }

    /** @param networkProtocol Details on network protocol used to filter findings. */
    public fun networkProtocol(vararg networkProtocol: Any) {
        _networkProtocol.addAll(listOf(*networkProtocol))
    }

    /** @param networkProtocol Details on network protocol used to filter findings. */
    public fun networkProtocol(networkProtocol: Collection<Any>) {
        _networkProtocol.addAll(networkProtocol)
    }

    /** @param networkProtocol Details on network protocol used to filter findings. */
    public fun networkProtocol(networkProtocol: IResolvable) {
        cdkBuilder.networkProtocol(networkProtocol)
    }

    /** @param portRange Details on the port ranges used to filter findings. */
    public fun portRange(vararg portRange: Any) {
        _portRange.addAll(listOf(*portRange))
    }

    /** @param portRange Details on the port ranges used to filter findings. */
    public fun portRange(portRange: Collection<Any>) {
        _portRange.addAll(portRange)
    }

    /** @param portRange Details on the port ranges used to filter findings. */
    public fun portRange(portRange: IResolvable) {
        cdkBuilder.portRange(portRange)
    }

    /**
     * @param relatedVulnerabilities Details on the related vulnerabilities used to filter findings.
     */
    public fun relatedVulnerabilities(vararg relatedVulnerabilities: Any) {
        _relatedVulnerabilities.addAll(listOf(*relatedVulnerabilities))
    }

    /**
     * @param relatedVulnerabilities Details on the related vulnerabilities used to filter findings.
     */
    public fun relatedVulnerabilities(relatedVulnerabilities: Collection<Any>) {
        _relatedVulnerabilities.addAll(relatedVulnerabilities)
    }

    /**
     * @param relatedVulnerabilities Details on the related vulnerabilities used to filter findings.
     */
    public fun relatedVulnerabilities(relatedVulnerabilities: IResolvable) {
        cdkBuilder.relatedVulnerabilities(relatedVulnerabilities)
    }

    /** @param resourceId Details on the resource IDs used to filter findings. */
    public fun resourceId(vararg resourceId: Any) {
        _resourceId.addAll(listOf(*resourceId))
    }

    /** @param resourceId Details on the resource IDs used to filter findings. */
    public fun resourceId(resourceId: Collection<Any>) {
        _resourceId.addAll(resourceId)
    }

    /** @param resourceId Details on the resource IDs used to filter findings. */
    public fun resourceId(resourceId: IResolvable) {
        cdkBuilder.resourceId(resourceId)
    }

    /** @param resourceTags Details on the resource tags used to filter findings. */
    public fun resourceTags(vararg resourceTags: Any) {
        _resourceTags.addAll(listOf(*resourceTags))
    }

    /** @param resourceTags Details on the resource tags used to filter findings. */
    public fun resourceTags(resourceTags: Collection<Any>) {
        _resourceTags.addAll(resourceTags)
    }

    /** @param resourceTags Details on the resource tags used to filter findings. */
    public fun resourceTags(resourceTags: IResolvable) {
        cdkBuilder.resourceTags(resourceTags)
    }

    /** @param resourceType Details on the resource types used to filter findings. */
    public fun resourceType(vararg resourceType: Any) {
        _resourceType.addAll(listOf(*resourceType))
    }

    /** @param resourceType Details on the resource types used to filter findings. */
    public fun resourceType(resourceType: Collection<Any>) {
        _resourceType.addAll(resourceType)
    }

    /** @param resourceType Details on the resource types used to filter findings. */
    public fun resourceType(resourceType: IResolvable) {
        cdkBuilder.resourceType(resourceType)
    }

    /** @param severity Details on the severity used to filter findings. */
    public fun severity(vararg severity: Any) {
        _severity.addAll(listOf(*severity))
    }

    /** @param severity Details on the severity used to filter findings. */
    public fun severity(severity: Collection<Any>) {
        _severity.addAll(severity)
    }

    /** @param severity Details on the severity used to filter findings. */
    public fun severity(severity: IResolvable) {
        cdkBuilder.severity(severity)
    }

    /** @param title Details on the finding title used to filter findings. */
    public fun title(vararg title: Any) {
        _title.addAll(listOf(*title))
    }

    /** @param title Details on the finding title used to filter findings. */
    public fun title(title: Collection<Any>) {
        _title.addAll(title)
    }

    /** @param title Details on the finding title used to filter findings. */
    public fun title(title: IResolvable) {
        cdkBuilder.title(title)
    }

    /**
     * @param updatedAt Details on the date and time a finding was last updated at used to filter
     *   findings.
     */
    public fun updatedAt(vararg updatedAt: Any) {
        _updatedAt.addAll(listOf(*updatedAt))
    }

    /**
     * @param updatedAt Details on the date and time a finding was last updated at used to filter
     *   findings.
     */
    public fun updatedAt(updatedAt: Collection<Any>) {
        _updatedAt.addAll(updatedAt)
    }

    /**
     * @param updatedAt Details on the date and time a finding was last updated at used to filter
     *   findings.
     */
    public fun updatedAt(updatedAt: IResolvable) {
        cdkBuilder.updatedAt(updatedAt)
    }

    /** @param vendorSeverity Details on the vendor severity used to filter findings. */
    public fun vendorSeverity(vararg vendorSeverity: Any) {
        _vendorSeverity.addAll(listOf(*vendorSeverity))
    }

    /** @param vendorSeverity Details on the vendor severity used to filter findings. */
    public fun vendorSeverity(vendorSeverity: Collection<Any>) {
        _vendorSeverity.addAll(vendorSeverity)
    }

    /** @param vendorSeverity Details on the vendor severity used to filter findings. */
    public fun vendorSeverity(vendorSeverity: IResolvable) {
        cdkBuilder.vendorSeverity(vendorSeverity)
    }

    /** @param vulnerabilityId Details on the vulnerability ID used to filter findings. */
    public fun vulnerabilityId(vararg vulnerabilityId: Any) {
        _vulnerabilityId.addAll(listOf(*vulnerabilityId))
    }

    /** @param vulnerabilityId Details on the vulnerability ID used to filter findings. */
    public fun vulnerabilityId(vulnerabilityId: Collection<Any>) {
        _vulnerabilityId.addAll(vulnerabilityId)
    }

    /** @param vulnerabilityId Details on the vulnerability ID used to filter findings. */
    public fun vulnerabilityId(vulnerabilityId: IResolvable) {
        cdkBuilder.vulnerabilityId(vulnerabilityId)
    }

    /** @param vulnerabilitySource Details on the vulnerability score to filter findings by. */
    public fun vulnerabilitySource(vararg vulnerabilitySource: Any) {
        _vulnerabilitySource.addAll(listOf(*vulnerabilitySource))
    }

    /** @param vulnerabilitySource Details on the vulnerability score to filter findings by. */
    public fun vulnerabilitySource(vulnerabilitySource: Collection<Any>) {
        _vulnerabilitySource.addAll(vulnerabilitySource)
    }

    /** @param vulnerabilitySource Details on the vulnerability score to filter findings by. */
    public fun vulnerabilitySource(vulnerabilitySource: IResolvable) {
        cdkBuilder.vulnerabilitySource(vulnerabilitySource)
    }

    /** @param vulnerablePackages Details on the vulnerable packages used to filter findings. */
    public fun vulnerablePackages(vararg vulnerablePackages: Any) {
        _vulnerablePackages.addAll(listOf(*vulnerablePackages))
    }

    /** @param vulnerablePackages Details on the vulnerable packages used to filter findings. */
    public fun vulnerablePackages(vulnerablePackages: Collection<Any>) {
        _vulnerablePackages.addAll(vulnerablePackages)
    }

    /** @param vulnerablePackages Details on the vulnerable packages used to filter findings. */
    public fun vulnerablePackages(vulnerablePackages: IResolvable) {
        cdkBuilder.vulnerablePackages(vulnerablePackages)
    }

    public fun build(): CfnFilter.FilterCriteriaProperty {
        if (_awsAccountId.isNotEmpty()) cdkBuilder.awsAccountId(_awsAccountId)
        if (_componentId.isNotEmpty()) cdkBuilder.componentId(_componentId)
        if (_componentType.isNotEmpty()) cdkBuilder.componentType(_componentType)
        if (_ec2InstanceImageId.isNotEmpty()) cdkBuilder.ec2InstanceImageId(_ec2InstanceImageId)
        if (_ec2InstanceSubnetId.isNotEmpty()) cdkBuilder.ec2InstanceSubnetId(_ec2InstanceSubnetId)
        if (_ec2InstanceVpcId.isNotEmpty()) cdkBuilder.ec2InstanceVpcId(_ec2InstanceVpcId)
        if (_ecrImageArchitecture.isNotEmpty())
            cdkBuilder.ecrImageArchitecture(_ecrImageArchitecture)
        if (_ecrImageHash.isNotEmpty()) cdkBuilder.ecrImageHash(_ecrImageHash)
        if (_ecrImagePushedAt.isNotEmpty()) cdkBuilder.ecrImagePushedAt(_ecrImagePushedAt)
        if (_ecrImageRegistry.isNotEmpty()) cdkBuilder.ecrImageRegistry(_ecrImageRegistry)
        if (_ecrImageRepositoryName.isNotEmpty())
            cdkBuilder.ecrImageRepositoryName(_ecrImageRepositoryName)
        if (_ecrImageTags.isNotEmpty()) cdkBuilder.ecrImageTags(_ecrImageTags)
        if (_findingArn.isNotEmpty()) cdkBuilder.findingArn(_findingArn)
        if (_findingStatus.isNotEmpty()) cdkBuilder.findingStatus(_findingStatus)
        if (_findingType.isNotEmpty()) cdkBuilder.findingType(_findingType)
        if (_firstObservedAt.isNotEmpty()) cdkBuilder.firstObservedAt(_firstObservedAt)
        if (_inspectorScore.isNotEmpty()) cdkBuilder.inspectorScore(_inspectorScore)
        if (_lastObservedAt.isNotEmpty()) cdkBuilder.lastObservedAt(_lastObservedAt)
        if (_networkProtocol.isNotEmpty()) cdkBuilder.networkProtocol(_networkProtocol)
        if (_portRange.isNotEmpty()) cdkBuilder.portRange(_portRange)
        if (_relatedVulnerabilities.isNotEmpty())
            cdkBuilder.relatedVulnerabilities(_relatedVulnerabilities)
        if (_resourceId.isNotEmpty()) cdkBuilder.resourceId(_resourceId)
        if (_resourceTags.isNotEmpty()) cdkBuilder.resourceTags(_resourceTags)
        if (_resourceType.isNotEmpty()) cdkBuilder.resourceType(_resourceType)
        if (_severity.isNotEmpty()) cdkBuilder.severity(_severity)
        if (_title.isNotEmpty()) cdkBuilder.title(_title)
        if (_updatedAt.isNotEmpty()) cdkBuilder.updatedAt(_updatedAt)
        if (_vendorSeverity.isNotEmpty()) cdkBuilder.vendorSeverity(_vendorSeverity)
        if (_vulnerabilityId.isNotEmpty()) cdkBuilder.vulnerabilityId(_vulnerabilityId)
        if (_vulnerabilitySource.isNotEmpty()) cdkBuilder.vulnerabilitySource(_vulnerabilitySource)
        if (_vulnerablePackages.isNotEmpty()) cdkBuilder.vulnerablePackages(_vulnerablePackages)
        return cdkBuilder.build()
    }
}
