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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.s3.BucketAttributes
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String

@CdkDslMarker
public class BucketAttributesDsl {
    private val cdkBuilder: BucketAttributes.Builder = BucketAttributes.builder()

    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    public fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
    }

    public fun bucketDomainName(bucketDomainName: String) {
        cdkBuilder.bucketDomainName(bucketDomainName)
    }

    public fun bucketDualStackDomainName(bucketDualStackDomainName: String) {
        cdkBuilder.bucketDualStackDomainName(bucketDualStackDomainName)
    }

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun bucketRegionalDomainName(bucketRegionalDomainName: String) {
        cdkBuilder.bucketRegionalDomainName(bucketRegionalDomainName)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun bucketWebsiteNewUrlFormat(bucketWebsiteNewUrlFormat: Boolean) {
        cdkBuilder.bucketWebsiteNewUrlFormat(bucketWebsiteNewUrlFormat)
    }

    public fun bucketWebsiteUrl(bucketWebsiteUrl: String) {
        cdkBuilder.bucketWebsiteUrl(bucketWebsiteUrl)
    }

    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun isWebsite(isWebsite: Boolean) {
        cdkBuilder.isWebsite(isWebsite)
    }

    public fun notificationsHandlerRole(notificationsHandlerRole: IRole) {
        cdkBuilder.notificationsHandlerRole(notificationsHandlerRole)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): BucketAttributes = cdkBuilder.build()
}
