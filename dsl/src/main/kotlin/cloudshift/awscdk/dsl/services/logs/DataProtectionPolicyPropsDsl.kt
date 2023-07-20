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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.logs.DataIdentifier
import software.amazon.awscdk.services.logs.DataProtectionPolicyProps
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class DataProtectionPolicyPropsDsl {
    private val cdkBuilder: DataProtectionPolicyProps.Builder = DataProtectionPolicyProps.builder()

    private val _identifiers: MutableList<DataIdentifier> = mutableListOf()

    public fun deliveryStreamNameAuditDestination(deliveryStreamNameAuditDestination: String) {
        cdkBuilder.deliveryStreamNameAuditDestination(deliveryStreamNameAuditDestination)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun identifiers(vararg identifiers: DataIdentifier) {
        _identifiers.addAll(listOf(*identifiers))
    }

    public fun identifiers(identifiers: Collection<DataIdentifier>) {
        _identifiers.addAll(identifiers)
    }

    public fun logGroupAuditDestination(logGroupAuditDestination: ILogGroup) {
        cdkBuilder.logGroupAuditDestination(logGroupAuditDestination)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun s3BucketAuditDestination(s3BucketAuditDestination: IBucket) {
        cdkBuilder.s3BucketAuditDestination(s3BucketAuditDestination)
    }

    public fun build(): DataProtectionPolicyProps {
        if (_identifiers.isNotEmpty()) cdkBuilder.identifiers(_identifiers)
        return cdkBuilder.build()
    }
}
