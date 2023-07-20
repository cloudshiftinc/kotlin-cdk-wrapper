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

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudtrail.InsightType
import software.amazon.awscdk.services.cloudtrail.ReadWriteType
import software.amazon.awscdk.services.cloudtrail.TrailProps
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.RetentionDays
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.sns.ITopic
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class TrailPropsDsl {
    private val cdkBuilder: TrailProps.Builder = TrailProps.builder()

    private val _insightTypes: MutableList<InsightType> = mutableListOf()

    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    public fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup) {
        cdkBuilder.cloudWatchLogGroup(cloudWatchLogGroup)
    }

    public fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays) {
        cdkBuilder.cloudWatchLogsRetention(cloudWatchLogsRetention)
    }

    public fun enableFileValidation(enableFileValidation: Boolean) {
        cdkBuilder.enableFileValidation(enableFileValidation)
    }

    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean) {
        cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents)
    }

    public fun insightTypes(vararg insightTypes: InsightType) {
        _insightTypes.addAll(listOf(*insightTypes))
    }

    public fun insightTypes(insightTypes: Collection<InsightType>) {
        _insightTypes.addAll(insightTypes)
    }

    public fun isMultiRegionTrail(isMultiRegionTrail: Boolean) {
        cdkBuilder.isMultiRegionTrail(isMultiRegionTrail)
    }

    public fun isOrganizationTrail(isOrganizationTrail: Boolean) {
        cdkBuilder.isOrganizationTrail(isOrganizationTrail)
    }

    public fun managementEvents(managementEvents: ReadWriteType) {
        cdkBuilder.managementEvents(managementEvents)
    }

    public fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    public fun sendToCloudWatchLogs(sendToCloudWatchLogs: Boolean) {
        cdkBuilder.sendToCloudWatchLogs(sendToCloudWatchLogs)
    }

    public fun snsTopic(snsTopic: ITopic) {
        cdkBuilder.snsTopic(snsTopic)
    }

    public fun trailName(trailName: String) {
        cdkBuilder.trailName(trailName)
    }

    public fun build(): TrailProps {
        if (_insightTypes.isNotEmpty()) cdkBuilder.insightTypes(_insightTypes)
        return cdkBuilder.build()
    }
}
