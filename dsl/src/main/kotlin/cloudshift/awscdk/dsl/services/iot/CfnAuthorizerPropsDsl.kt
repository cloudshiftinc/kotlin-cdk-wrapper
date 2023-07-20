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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnAuthorizerProps
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAuthorizerPropsDsl {
    private val cdkBuilder: CfnAuthorizerProps.Builder = CfnAuthorizerProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun authorizerFunctionArn(authorizerFunctionArn: String) {
        cdkBuilder.authorizerFunctionArn(authorizerFunctionArn)
    }

    public fun authorizerName(authorizerName: String) {
        cdkBuilder.authorizerName(authorizerName)
    }

    public fun enableCachingForHttp(enableCachingForHttp: Boolean) {
        cdkBuilder.enableCachingForHttp(enableCachingForHttp)
    }

    public fun enableCachingForHttp(enableCachingForHttp: IResolvable) {
        cdkBuilder.enableCachingForHttp(enableCachingForHttp)
    }

    public fun signingDisabled(signingDisabled: Boolean) {
        cdkBuilder.signingDisabled(signingDisabled)
    }

    public fun signingDisabled(signingDisabled: IResolvable) {
        cdkBuilder.signingDisabled(signingDisabled)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun tokenKeyName(tokenKeyName: String) {
        cdkBuilder.tokenKeyName(tokenKeyName)
    }

    public fun tokenSigningPublicKeys(tokenSigningPublicKeys: Map<String, String>) {
        cdkBuilder.tokenSigningPublicKeys(tokenSigningPublicKeys)
    }

    public fun tokenSigningPublicKeys(tokenSigningPublicKeys: IResolvable) {
        cdkBuilder.tokenSigningPublicKeys(tokenSigningPublicKeys)
    }

    public fun build(): CfnAuthorizerProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
