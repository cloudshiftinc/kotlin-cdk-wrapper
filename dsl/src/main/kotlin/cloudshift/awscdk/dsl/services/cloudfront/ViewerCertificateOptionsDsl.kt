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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.SSLMethod
import software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol
import software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ViewerCertificateOptionsDsl {
    private val cdkBuilder: ViewerCertificateOptions.Builder = ViewerCertificateOptions.builder()

    private val _aliases: MutableList<String> = mutableListOf()

    public fun aliases(vararg aliases: String) {
        _aliases.addAll(listOf(*aliases))
    }

    public fun aliases(aliases: Collection<String>) {
        _aliases.addAll(aliases)
    }

    public fun securityPolicy(securityPolicy: SecurityPolicyProtocol) {
        cdkBuilder.securityPolicy(securityPolicy)
    }

    public fun sslMethod(sslMethod: SSLMethod) {
        cdkBuilder.sslMethod(sslMethod)
    }

    public fun build(): ViewerCertificateOptions {
        if (_aliases.isNotEmpty()) cdkBuilder.aliases(_aliases)
        return cdkBuilder.build()
    }
}
